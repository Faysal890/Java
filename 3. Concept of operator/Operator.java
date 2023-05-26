import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // increment and decrement operator
        int a = 5;
        // Post increment and decrement
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        // Pre Increment and decrement
        System.out.println(++a);

        System.out.println(--a);
        // Arithmetic operator
        int x = 4, y = 2;
        System.out.println("Addition 4+2 : "+(x+y));
        System.out.println("Subtraction 4-2 : "+(x-y));
        System.out.println("Multiplication : "+x*y);
        System.out.println("Division : "+x/y);
        // Relational operator
        if(5>1) System.out.println("5>1 : 5 is greater than 1");
        if(5<6) System.out.println("5<6 : 5 is less than 6");
        if(4==4) System.out.println("4==4 : 4 is equal to 4");
        if(4>=2) System.out.println("4>=4 : 4 is greater than or equal to 4");
        if(4<=5) System.out.println("4<=5 : 4 is less than or equal to 5");
        // Bitwise operator
        System.out.println("Bitwise OR : "+(5|2));
        System.out.println("Bitwise AND : "+(1&3));
        System.out.println("Bitwise XOR : "+(3^1));
        System.out.println("Left Shift : "+(2<<1));
        System.out.println("Right Shift : "+(4>>1));
        System.out.println("Bitwise Complement : "+(~2));
        // Conditional operator
        System.out.println(5>2 ? 5 : 2);
    }
}
