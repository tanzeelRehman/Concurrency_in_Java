package Synchronized_Counter_LabTask;

import java.util.concurrent.Semaphore;

public class Counter implements Runnable{
    private int count =0;
    Semaphore semaphore = new Semaphore(1);
    public void increment(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }
    public void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            this.increment();
            System.out.println("Value for "+Thread.currentThread().getName()+ " after increment "+ this.getCount());

            this.decrement();
            System.out.println("Value for "+Thread.currentThread().getName()+ " at end "+ this.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }

    }
}
class RaceCondition{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter,"Th1");
        Thread t2 = new Thread(counter,"Th2");
        Thread t3 = new Thread(counter,"Th3");
        t1.start();
        t2.start();
        t3.start();
    }
}
