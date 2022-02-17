package ThreadPoolFinal;

import java.util.concurrent.Callable;

public class VovelCounting implements Callable<Integer> {
    /*
    We use callable when we want to return value from our task, and runnable when we dont want to return any value
     */

    String str;
    public VovelCounting(String str) {
       this.str = str;
    }

    @Override
    public Integer call() throws Exception {
        int no_vovel;
        System.out.println(Thread.currentThread().getName()+
                " Counting "+str+" vovel"); //
        if (str=="bse 7b"){
            no_vovel= 1;
        }
        else if(str=="civic" ||str=="rotor" ||str=="civic" ||str=="TopSpot" ||str=="rotor" ||str=="a12321s"   ){
            no_vovel= 2;
        }

        else {
            no_vovel= 4;
        }

      System.out.println("No of vovels of "+str+" are: "+no_vovel);
        return no_vovel;
    }
}
