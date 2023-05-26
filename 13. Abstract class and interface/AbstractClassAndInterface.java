//Abstract class
abstract class Sea {
    int island;
    public abstract void house();
    void ship() {
        System.out.println("There is a ship on the sea");
    }
}
class Finder extends Sea {
    public void house(){
        System.out.println("There is an underwater house in the sea");
    } 
}

//Interface
interface Bridge {
    int boat = 20;
    public void padmaBridge();    
}
class Builder implements Bridge {
    public void padmaBridge() {
        System.out.println("We build padma bridge");
    }
}

public class AbstractClassAndInterface {
        public static void main(String[] args) {
        Finder find = new Finder();
        find.ship();
        find.house();
        find.island = 10;
        System.out.println("There is "+find.island+" islands in the sea\n");

        Builder build = new Builder();
        build.padmaBridge();
        System.out.println("There are "+build.boat+" boats in the river");
    }


}
