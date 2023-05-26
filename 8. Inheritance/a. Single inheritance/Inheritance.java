//Single inheritance
class A{
    void printA(){
        System.out.println("Properties of A");
    }
}
class B extends A{
    void printB(){
        System.out.println("Properties of B");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        B obj = new B();
        obj.printA();
        obj.printB();
    }
}