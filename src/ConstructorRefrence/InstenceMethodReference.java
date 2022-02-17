package ConstructorRefrence;

import java.util.function.BiFunction;

public class InstenceMethodReference {

   public int add(int a , int b){
       return  a+b;
   }
}

class InstenceMethodReferanceDemo{
    public static void main(String[] args) {
        InstenceMethodReference Ims = new InstenceMethodReference();
        //        return type
        BiFunction<Integer,     Integer,     Integer> adder = Ims::add;
        int num1 = 10;
        int num2 = 20;
        int result = adder.apply(num1,num2);
        System.out.println(num1+"+"+num2+"="+result);
    }
}
