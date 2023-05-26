class DataTypes{
    short s;
    int n;
    float f;
    double d;
    long l;
    byte b;
    char c;
    boolean bl;
}
public class DefaultValueOfPrimitiveDataTypes {
    public static void main(String[] args) {
        DataTypes obj = new DataTypes();
        System.out.println("Short : "+obj.s+"\nInt : "+obj.n+"\nFloat : "+obj.f+"\nDouble : "+obj.d+"\nLong : "+obj.l+"\nByte : "+obj.b+"\nChar : "+obj.c+"\nBoolean : "+obj.bl);
    }
}
