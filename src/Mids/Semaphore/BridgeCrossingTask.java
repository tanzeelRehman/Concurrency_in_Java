package Mids.Semaphore;

import Binary_Semaphore.MyResource;

import java.util.concurrent.Semaphore;

public class BridgeCrossingTask extends Thread{
    Semaphore semaphore;
    String threadName;
    BridgeCrossingTask(Semaphore semaphore, String threadName){
        this.semaphore = semaphore;
        this.threadName= threadName;
    }
    @Override
    public void run() {
        if (this.threadName.equals("Green")){
            System.out.println("Train "+threadName+"reached at rail bridge and waiting for the signal");
            try {

                semaphore.acquire();
                System.out.println(threadName +" Got Signal and passing, It will take 10 seconds to pass");

                Thread.sleep(10000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("Train "+threadName+ " has passed");
            semaphore.release();
        }
        // T2 PROCESSING
        else {
            System.out.println("Train "+threadName+"reached at rail bridge and waiting for the signal");
            try {

                semaphore.acquire();
                System.out.println(threadName +" Got Signal and passing, It will take 10 seconds to pass");

                Thread.sleep(10000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("Train "+threadName+ " has passed");
            semaphore.release();
        }
    }
}
