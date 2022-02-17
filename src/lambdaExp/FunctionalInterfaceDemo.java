package lambdaExp;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        MyInterface example = new MyInterface() {
            @Override
            public void call() {
                System.out.println("Hello world");
            }
        };
        example.call();
    }

}
// THIS IS CALLED FUNCTIONAL INTERFACE: INTERFACE WHICH ONLY HAS ONE METHOD

