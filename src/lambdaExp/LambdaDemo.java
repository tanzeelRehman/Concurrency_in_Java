package lambdaExp;

public class LambdaDemo {
    public static void main(String[] args) {
        // [ -> ] called lambda expression

        //EXPRESSION LAMBDA
        MyInterface lambda = ()-> System.out.println("Hello world - expression lambda");
        lambda.call();

        //BLOCK LAMBDA
        MyInterface lambda2 = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello world - Block lambda");
            }


        };
        lambda2.call();
    }
}
