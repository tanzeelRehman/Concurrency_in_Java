package Producer_Consumer;

public class pc_Demo {
    public static void main(String[] args) throws InterruptedException {
    Cook cook = new Cook();
    Waiter waiter = new Waiter();

    new Thread(cook).start();
    new Thread(waiter).start();


    }
}
