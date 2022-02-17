package lambdaExp;

import java.io.File;

public class FileFilterDemo {
    public static void main(String[] args) {

        // ANNONIMUS INNER CLASS
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith("pdf");
            }
        };
        boolean result = fileFilter.accept( new File("abc.pdf"));
        System.out.println(result);

        // LAMBDA EXPRESSION

        FileFilter fileFilter2 = (File file) ->  file.getName().endsWith("pdf");
        boolean result2 = fileFilter.accept( new File("abc.pdf"));
       System.out.println(result);
    }
}
