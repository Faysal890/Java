
class Dhaka{
    void print() {
        System.out.println("From Dhaka");
    }
}
class Faridpur extends Dhaka{
    void print() {
        System.out.println("From Faridpur");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Faridpur obj = new Faridpur();
        obj.print();
    }
}
