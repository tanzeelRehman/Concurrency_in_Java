package Mutex_TableGen;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Table_Generator table_generator = new Table_Generator(semaphore);
        Thread table5 = new Thread(new Runnable() {
            @Override
            public void run() {
                table_generator.generateTable(5);
            }
        });

        Thread table6= new Thread(new Runnable() {
            @Override
            public void run() {
                table_generator.generateTable(6);
            }
        });

        table5.start();
        table6.start();
    }
}
