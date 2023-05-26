import java.util.Scanner;
public class ConditionalStatementAndLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5, y =3;
        // iff, if, else if, else
        if(x>y){
            if(y>2){
                System.out.println("x is also greater than 2");
            }
        }
        if(x==y){
            System.out.println("x is equal to y");
        }
        else if(x>y){
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }
        // Switch statment
        System.out.println("Enter x : ");
        x = sc.nextInt();
        switch(x){
            case 1 : System.out.println("x = 1");
                     break;
            case 2 : System.out.println("x = 2");
                     break;
            case 5 : System.out.println("X = 5");
                     break;
            case 6 : System.out.println("x = 6");
                     break;
            default: System.out.println("No value form 1, 2, 5, 6");
        }
        // For loop 
        for(int i = 1; i <= x; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        while(x-->=0){
            System.out.print(x+" ");
        }
        System.out.println();
        do{
            System.out.print(x+" ");
            x++;
        } while(x<6);

    }
}