
class A{
    void printA(){
        System.out.println("Properties of class A");
    }
}
class B extends A{
    void printB(){
        System.out.println("Properties of class B");
    }
}
class C extends B{
    void printC(){
        System.out.println("Properties of class C");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
        obj.printB();
        obj.printC();
    }
}
