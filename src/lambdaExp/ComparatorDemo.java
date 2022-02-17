package lambdaExp;

import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {

        //  ANNONINUMUS INNER CLASS
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        System.out.println(comparator.compare("hello","HELLO"));


        // LAMBDA EXPRESSION
        Comparator<String> comparator2 = (String s1, String s2)-> Integer.compare(s1.length(),s2.length());
        System.out.println(comparator2.compare("hello","HELLO"));

    }

}
