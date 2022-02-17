package ConstructorRefrence;

public interface Messageable {
    Message getMessage(String message);
}
class Message{
    Message(String message){
        System.out.println(message);
    }

}
class ConstructorReference{
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello world");
    }
}
/*
SAME LOGIC LIKE ASSIGNMENT
int x = 10;
int y = 20;
x=y;
THIS IS CALLED ASSIGNMENT

AND THE SOLVED EXAMPLE IS CALLED BINDING
 */