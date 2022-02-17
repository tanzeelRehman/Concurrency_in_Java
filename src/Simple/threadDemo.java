public class threadDemo {
    public static void main(String[] args) {
        MyRunnable commoninstance = new MyRunnable();
        Thread t1 = new Thread(commoninstance);
//        Thread t2 = new Thread(commoninstance);
//        Thread t3 = new Thread(commoninstance);
//        Thread t4 = new Thread(commoninstance);

        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

    }


}
