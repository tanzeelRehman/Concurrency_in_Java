package Binary_Semaphore;

import java.util.concurrent.Semaphore;

public class MyThread  extends  Thread{
    Semaphore sem;

    public MyThread(Semaphore sem, String threadName) {
        super(threadName);
        this.sem = sem;
        ThreadName = threadName;
    }

    public String getThreadName() {
        return ThreadName;
    }

    String ThreadName;

    @Override
    public void run() {
        if (this.getThreadName().equals("T1")){
            System.out.println("Start: "+ ThreadName);
            try {
                System.out.println(ThreadName + " Wating for a  permit");
                // AQUIRE
                sem.acquire();
                System.out.println(ThreadName + " Aquired permit");

                for (int i = 0; i < 5; i++) {
                    MyResource.cout++;
                    System.out.println(ThreadName + ":" + MyResource.cout);
                    Thread.sleep(10);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(ThreadName + ": Released the permit");
            sem.release();
        }
        // T2 PROCESSING
        else {
            System.out.println("Start: "+ ThreadName);
            try {
                System.out.println(ThreadName + "Wating for a  permit");
                // AQUIRE
                sem.acquire();
                System.out.println(ThreadName + "Aquired permit");

                for (int i = 0; i < 5; i++) {
                    MyResource.cout--;
                    System.out.println(ThreadName + ":" + MyResource.cout);
                    Thread.sleep(10);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(ThreadName + ": Released the permit");
            sem.release();
        }
    }
}
