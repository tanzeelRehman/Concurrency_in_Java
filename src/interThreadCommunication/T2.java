package interThreadCommunication;

public class T2 implements  Runnable{
    public T2(Chat m) {
        this.m = m;
        new Thread(this,"Answer").start();
    }

    Chat m;

    String [] s1 = {"HI","I am fine?","Great"};



    @Override
    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.answer(s1[i]);
        }
    }
}
