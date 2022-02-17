package StaticMethodRefrence;

public class StaticMethodRefrence {
    public static void saySomething(){
        System.out.println("Hello say Something");
    }

    public static void main(String[] args) {
        Sayable sayable =  StaticMethodRefrence::saySomething;
        sayable.say();
    }

}
