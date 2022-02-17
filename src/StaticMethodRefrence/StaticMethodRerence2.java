package StaticMethodRefrence;

//public class StaticMethodRerence2 {
//    public static void main(String[] args) {
//        Thread t2 = new Thread(()-> System.out.println("Thread is running.."));
//        t2.start();
//    }
//}

public class StaticMethodRerence2 {
    public static  void  ThreadStatus(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(StaticMethodRerence2::ThreadStatus);
        t2.start();
    }
}

