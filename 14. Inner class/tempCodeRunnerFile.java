import javax.sound.sampled.SourceDataLine;

class A {
    void print() {
        System.out.println("In class A");
    }
    class B {
        void print() {
            System.out.println("In inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();

        A.B objInner = obj.new B();
        objInner.print();
    }
}
