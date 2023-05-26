class Calculator {
    int divide(int x, int y) throws Exception{
        return x/y;
    }
}
public class ExceptionHandeling {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int[] arr = new int[4];
        
        try{
            arr[4] = 234;            
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Executed successfully");
        }

        int x;
        try{
            x = 100/1000;
            if(x == 0)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }

        try{
            cal.divide(3, 0);
        }
        catch(Exception e){
            System.out.println("There is an exception in this method");
        }

    }
    
}
