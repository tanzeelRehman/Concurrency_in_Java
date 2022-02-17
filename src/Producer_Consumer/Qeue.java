package Producer_Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Qeue {
    private Qeue(){}

   static private BlockingQueue<Integer> queue = new ArrayBlockingQueue(3);
    public static BlockingQueue<Integer> getQueue(){
        return  queue;
    }

}
