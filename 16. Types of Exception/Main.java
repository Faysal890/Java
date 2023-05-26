public class Main {
    public static void main(String[] args) {
        int x = 5, y = 0, n;
        int[] arr = new int[5];
        String s = null, name = "Jerry";

        try{
            n = x/y;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }

        try{
            arr[5] = 420;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try{
           int size = s.length();
        }
        catch(NullPointerException ex) {
            System.out.println(ex);
        }

        try{
            System.out.println(name.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
