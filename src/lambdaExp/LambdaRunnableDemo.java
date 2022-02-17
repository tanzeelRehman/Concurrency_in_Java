package lambdaExp;

public class LambdaRunnableDemo {
    public static void main(String[] args) {

        //  ANNONONIMUS INNER CLASS
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world from a thread: "+Thread.currentThread().getName());
            }
        };
        Thread t = new Thread(task);
        t.start();

        // LAMBDA EXP
        Runnable tsk = ()->System.out.println("Hello world from a thread: "+Thread.currentThread().getName());
        new Thread(tsk).start();
    }
}
