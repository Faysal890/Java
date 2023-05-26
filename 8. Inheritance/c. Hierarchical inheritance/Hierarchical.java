
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
class C extends A{
    void printC(){
        System.out.println("Properties of C");
    }
}
class D extends A{
    void printD(){
        System.out.println("Properties of D");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.printA();
        obj1.printB();

        D obj2 = new D();
        obj2.printA();
        obj2.printD();
    }
}
