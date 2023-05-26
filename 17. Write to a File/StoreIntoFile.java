import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class StoreIntoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            File file = new File("NewFile");
        }
        catch(Exception e) {
            System.out.println(e);
        }

        try{
            FileWriter writer = new FileWriter("NewFile");
            System.out.println("Enter your data");
            String s = sc.nextLine();
            writer.write(s+"\n");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
