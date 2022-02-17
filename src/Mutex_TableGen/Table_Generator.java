package Mutex_TableGen;

import java.util.concurrent.Semaphore;

public class Table_Generator {
    Semaphore mutex;

    Table_Generator(Semaphore semaphore){
        this.mutex = semaphore;
    }

    public  void  generateTable(int table){
        try {
            mutex.acquire();
            for (int i = 1; i < 10 ; i++) {
                System.out.println(table+" x "+i+" = "+ table*i);
            }
            mutex.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
