package even_odd_labtask;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        Semaphore even = new Semaphore(0);
        Semaphore odd = new Semaphore(1);
        EvenNumber evenNumbers = new EvenNumber(even,odd);
        OddNumber oddNumbers = new OddNumber(even,odd);
        Thread evenThread = new Thread(evenNumbers,"Even-Number");
        Thread oddThread = new Thread(oddNumbers,"Odd-Number");
        System.out.println("Printing even & odd numbers up-to 10 in sequence");
        evenThread.start();
        oddThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
