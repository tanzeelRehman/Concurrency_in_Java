public class MyRunnable implements Runnable{
    int counter;
    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();
    @Override
    public void run() {
        counter++;
        threadLocalCounter.set(1);
        System.out.println(   threadLocalCounter.get());
        threadLocalCounter.set(2);
        System.out.println(   threadLocalCounter.get());
        System.out.println("initial value " +   threadLocalCounter.get().intValue());
        threadLocalCounter.remove();
        System.out.println(   threadLocalCounter.get().intValue());



//        if (threadLocalCounter.get() !=null){
//            threadLocalCounter.set(threadLocalCounter.get().intValue()+1);
//        } else {
//            threadLocalCounter.set(0);
//        }
        System.out.println("counter: "+counter);
        System.out.println("Thread counter: "+threadLocalCounter.get());
    }
}
