package Producer_Consumer;

import java.util.Random;

public class Cook implements Runnable{
    int orderId;
    int timetaken;
    Random random = new Random();
    @Override
    public void run() {
        while (true){
          orderId = random.nextInt(100);
            timetaken = random.nextInt(10);
            System.out.println("Cook: Time taken to produce Order no: "+orderId+" in "+timetaken+" seconds");
            try {
                Qeue.getQueue().put(orderId);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
