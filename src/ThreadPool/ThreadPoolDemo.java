package ThreadPool;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new PotatoPeelingTask(6));
        tasks.add(new CoffeeMakingTask(2));
        tasks.add(new CoffeeMakingTask(6));
        tasks.add(new PotatoPeelingTask(4));
        tasks.add(new CoffeeMakingTask(2));
        tasks.add(new PotatoPeelingTask(4));
        tasks.add(new CoffeeMakingTask(9));
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new CoffeeMakingTask(2));
        tasks.add(new PotatoPeelingTask(4));
        tasks.add(new CoffeeMakingTask(2));
        tasks.add(new CoffeeMakingTask(7));
        tasks.add(new PotatoPeelingTask(4));
        tasks.add(new PotatoPeelingTask(5));

        // Creates a thread pool that reuses a fixed number of threads operating off a shared
        // unbounded queue. At any point, at most nThreads threads will be active processing
        // tasks. If additional tasks are submitted when all threads are active, they will wait
        // in the queue until a thread is available.

        ExecutorService executorService =
                Executors.newFixedThreadPool(3);
        for(Task t: tasks){
            executorService.execute(new Worker(t));
        }


        // All tasks were executed, now shutdown
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.yield();
        }
        System.out.println("Program finished");
    }
}
