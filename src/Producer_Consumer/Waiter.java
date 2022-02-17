package Producer_Consumer;

public class Waiter implements Runnable{
    @Override
    public void run() {
        while (true){
            int orderId = 0;
            try {
                orderId = Qeue.getQueue().take();
                Qeue.getQueue().take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Waiter: Serving Order no: "+orderId+": There are "+Qeue.getQueue().size()+" Items on the shelf");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
