package project;
import NewPackage.*;

public class Main {
    public static void main(String[] args) {
        //Access from source class
        Student st = new Student();
        st.name = "Walid";
        st.id = 32048;
        st.setMark(85.5);
        System.out.println("Name : "+st.name+"\nID : "+st.id+"\nMark : "+st.getMark());
        
        //Access from same project and subclass
        Student1 st1 = new Student1();
        st1.name = "Rahat";
        st1.id = 23425;
        System.out.println("Name : "+st1.name+"\nID : "+st1.id);
        
        //Access from same project 
        Information info = new Information();
        info.print();
        
        //Access from different project and subclass
        Student3 st2 = new Student3();
        st2.name = "Abir";
        st2.id = 2352;
        System.out.println("Name : "+st2.name+"\nID : "+st2.id);
        
        
    }
    
}
