// Java dosen't support multiple inheritance. We need interface for multiple inheritance.
interface A {
    public void printA();
    public void print();
}
interface B {
    public void printB();
    public void print();
}
class C implements A,B {
    public void printA(){
        System.out.println("Properties of A implements by c");
    }
    public void printB(){
        System.out.println("Properties of B implements by C");
    }
    public void print() {
        System.out.println("Hello world");
    }
}
public class Multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.print();
        obj.printA();
        obj.printB();
    }
    
}
