
class Student {
    public String name;
    public int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    //Copy constuctor
    Student(Student st) {
        this.name = st.name;
        this.id = st.id;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student st1 = new Student("Tom",420);
        System.out.println("Name : "+st1.name);
        System.out.println("ID : "+st1.id);
        
        Student st2 = new Student(st1);
        System.out.println("By copy constructor");
        System.out.println("Name : "+st2.name);
        System.out.println("ID : "+st2.id);
    }
}
