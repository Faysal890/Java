import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class Read {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("NewFile.txt");
            writer.write("Hello world\nThis program will read a File");
            writer.close();
            File file = new File("NewFile.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String s = scan.nextLine();
                System.out.println(s);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
