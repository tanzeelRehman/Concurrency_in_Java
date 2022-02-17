package ThreadPoolFinal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Pool {
    public static void main(String[] args) {

        // MAKING EXECUTOR SERVICE WITH 4 THREADS
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // SUBMIT METHOD IS USE WHEN WE CALL CALLABLE INTERFACE AS IT RETURNS A FUTURE VALUE
        Future<Integer>  res1 =  executorService.submit( new VovelCounting("bse 7b"));
        Future<Integer>  res2 =  executorService.submit( new VovelCounting("civic"));
        Future<Integer>    res3 =  executorService.submit( new VovelCounting("rotor"));
        Future<Integer>   res4 =  executorService.submit( new VovelCounting("TopSpot"));
        Future<Integer>  res5 =  executorService.submit( new VovelCounting("a12321s"));
        Future<Integer>  res6 =  executorService.submit( new VovelCounting("step on no pets"));

        /*
        Get method is used to get future value from Future<DataType> variable,
        this variable has all  info about task either completed or not
         */

        try {

            /*
            We are using try and catch block beacuse we are taking value from a future variable, and it can be null or
            task completed could be un successfull
         */
            int str1 = res1.get();
            System.out.println(str1);
            int  str2 = res2.get();
            System.out.println(str2);
            int str3 = res3.get();
            System.out.println(str3);
            int str4 = res4.get();
            System.out.println(str4);
            int str5 = res5.get();
            System.out.println(str5);
            int str6 = res6.get();
            System.out.println(str6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Shutting down executor service beacuse if it keep running it will (Zaya) Resources
        executorService.shutdown();
    }


}
