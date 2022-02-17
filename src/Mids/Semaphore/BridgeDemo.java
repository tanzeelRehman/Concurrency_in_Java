package Mids.Semaphore;

import Binary_Semaphore.MyThread;

import java.util.concurrent.Semaphore;

public class BridgeDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        BridgeCrossingTask thread1 = new BridgeCrossingTask(semaphore,"Green");
        BridgeCrossingTask thread2 = new BridgeCrossingTask(semaphore,"AllamaIqbal");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
