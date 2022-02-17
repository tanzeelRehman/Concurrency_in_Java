package lambdaExp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LambdaWithoutInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> intSeq  = Arrays.asList(1,2,3);

        // LAMBDA EXPRESSION
        intSeq.forEach(x-> System.out.println(x));

        intSeq.forEach(System.out::println);

        // LAMBDA BLOCK
        intSeq.forEach(x->{
            x+=2;
            System.out.println(x);
        });


       /* LAMBDA BLOCK WITH VARIABLES DECLARED IN IT
       We can declared variables, if else, loops everything in lambda exp

        */
        intSeq.forEach(x->{
            int y = x+2;
            System.out.println(y);
        });


        //  WE CAN ALSO EXPLICITELY DECLARED VARIABL TYPE IN LAMBDA EXP
        intSeq.forEach((Integer x)->{
            int y = x+2;
            System.out.println(y);
        });
    }
}
