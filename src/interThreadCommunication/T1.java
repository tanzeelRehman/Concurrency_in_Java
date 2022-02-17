package interThreadCommunication;

public class T1 implements  Runnable{
    public T1(Chat m) {
        this.m = m;
        new Thread(this,"Question").start();
    }

    Chat m;

    String [] s1 = {"HI","How are you?","I am also doing fine"};

    @Override
    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.question(s1[i]);
        }
    }
}
