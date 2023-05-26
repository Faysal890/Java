class Calculator{
    double pi;
    //Method overloading
    int sum(int x, int y){
        return x+y;
    }
    int sum(int x, int y, int z) {
        return x+y+z;
    }
    //Constructor overloading
    Calculator(){

    }
    Calculator(double pi) {
        this.pi = pi;
    }

}

public class Overloading{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("PI = "+cal.pi);

        Calculator calculator = new Calculator(3.1416);
        System.out.println("5+3 = "+calculator.sum(5,3));
        System.out.println("3+4+6 = "+calculator.sum(3,4,6));
        System.out.println("PI = "+calculator.pi);

    }
}