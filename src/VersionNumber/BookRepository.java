package VersionNumber;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    private final Map<Long, Book> collection = new HashMap<>();

    /**
     * Adds book to collection.
     * Actually we are putting copy of book (saving a book by value, not by reference);
     */
    public void add(Book book) throws BookDuplicateException {
        if (collection.containsKey(book.getId())) {
            throw new BookDuplicateException("Duplicated book with id: " + book.getId());
        }

        // add copy of the book
        collection.put(book.getId(), new Book(book));
    }

    /**
     * Updates book in collection only if client has modified the latest version of the book.
     */
    public void update(Book book) throws BooknotFoundException, VersionMisMatchException {
        if (!collection.containsKey(book.getId())) {
            throw new BooknotFoundException("Not found book with id: " + book.getId());
        }

        Book latestBook = collection.get(book.getId());
        if (book.getVersion() != latestBook.getVersion()) {
            throw new VersionMisMatchException(
                    "Tried to update stale version " + book.getVersion()
                            + " while actual version is " + latestBook.getVersion()
            );
        }

        // update version, including client representation - modify by reference here
        book.setVersion(book.getVersion() + 1);

        // save book copy to repository
        collection.put(book.getId(), new Book(book));
    }

    /**
     * Returns book representation to the client.
     * Representation means we are returning copy of the book.
     */
    public Book get(long bookId) throws BooknotFoundException {
        if (!collection.containsKey(bookId)) {
            throw new BooknotFoundException("Not found book with id: " + bookId);
        }

        // return copy of the book
        return new Book(collection.get(bookId));
    }
}
