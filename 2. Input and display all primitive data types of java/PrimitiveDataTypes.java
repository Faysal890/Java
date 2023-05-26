import java.util.Scanner;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter short : ");
        short s = sc.nextShort();
        System.out.print("Enter Int : ");
        int n = sc.nextInt();
        System.out.print("Enter Float : ");
        float f = sc.nextFloat();
        System.out.print("Enter Double : ");
        double d = sc.nextDouble();
        System.out.print("Enter Long : ");
        long l = sc.nextLong();
        System.out.print("Enter Byte : ");
        byte b = sc.nextByte();
        System.out.print("Enter Character : ");
        char c = sc.next().charAt(0);
        System.out.print("Enter Boolean : ");
        boolean bl = sc.nextBoolean();
        System.out.println("Short : "+s+"\nInt : "+n+"\nFloat : "+f+"\nDouble : "+d+"\nLong : "+l+"\nByte : "+b+"\nChar : "+c+"\nBoolean : "+bl);
    }
}
