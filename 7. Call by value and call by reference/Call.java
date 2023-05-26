import java.util.Scanner;
class Swap{
    int x =5 , y = 9;

    void callByValue(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    void callByReference(Swap obj){
        int temp = obj.x;
        obj.x = y;
        obj.y = temp;
    }
}
public class Call {
    public static void main(String[] args) {
        Swap obj = new Swap();
        System.out.println("Call by value :\nBefore swaping\nx = "+obj.x+"\ny = "+obj.y);
        obj.callByValue(obj.x, obj.y);
        System.out.println("After swaping\nx = "+obj.x+"\ny = "+obj.y);

        System.out.println("Call by reference :\nBefore swaping\nx = "+obj.x+"\ny = "+obj.y);
        obj.callByReference(obj);
        System.out.println("After swaping\nx = "+obj.x+"\ny = "+obj.y);
    }
}
