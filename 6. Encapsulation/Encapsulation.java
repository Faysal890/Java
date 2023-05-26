import java.util.Scanner;
class Student{
    private String name;
    private int id;
    private String email;
   
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("Enter Name :");
        String name = sc.nextLine(), email;
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        System.out.println("Enter Email :");
        email = sc.next();
        student1.setName(name);
        student1.setId(id);
        student1.setId(id);
        System.out.println("\nStudent Information :");
        System.out.println("Name : "+student1.getName());
        System.out.println("ID : "+student1.getId());
        System.out.println("Email :"+student1.getEmail());
    }
}