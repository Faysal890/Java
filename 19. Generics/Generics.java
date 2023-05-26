class vector<T>{
    T val;
}
public class Generics {
    public static void main(String[] args) {
        vector<Integer> x = new vector<>();
        x.val = 4;
        System.out.println("Stored integer value : "+x.val);

        vector<String> s = new vector<>();
        s.val = "Hello world";
        System.out.println("Stored String : "+s.val);

        vector<Double> d = new vector<>();
        d.val = 203478.2;
        System.out.println("Stored Double value : "+d.val);
    }
}
