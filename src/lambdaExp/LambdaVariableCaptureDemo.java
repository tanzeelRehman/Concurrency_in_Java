package lambdaExp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class LambdaVariableCaptureDemo {
    private  static int outsidevar =100;
    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1,2,3);
        final int var = 10;

        /*
        Lambda exp can also capture variables from outside, But the condition is for effective code out side
        variables  must be declared final

         */
        intSeq.forEach(x-> System.out.println(x+var));

        intSeq.forEach(x-> System.out.println(x+outsidevar));
    }
}
