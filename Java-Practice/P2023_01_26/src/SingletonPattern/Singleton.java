package SingletonPattern;

public class Singleton {

    private static Singleton one;
    private Singleton(){}

    // Practice one = new Practice();

    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton();
        }
        return one;
    }

    public static void main(String[] args) {

        Singleton p1 = Singleton.getInstance();
        Singleton p2 = Singleton.getInstance();

        //SingletonPattern.Singleton
        Singleton p3 = new Singleton();
        Singleton p4 = new Singleton();

        //new
        System.out.println(p1 == p2);
        System.out.println(p3 == p4);
    }
}
