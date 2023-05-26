//Access from different project
package NewPackage;
import project.Student;
public class Student4 {
    public static void main(String[] args) {
        Student st = new Student("Rakib");
        
        System.out.println(st.name);  
    }
}
