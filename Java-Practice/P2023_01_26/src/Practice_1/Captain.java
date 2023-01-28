package Practice_1;

public class Captain extends Person implements Imp {

    public Captain(String name, int age){
        super(name, age);
    }
    @Override
    public void run() {
        System.out.println("빠르게 달린다");
    }

    @Override
    public void fight() {
        System.out.println("싸워서 이긴다");
    }

    @Override
    public void fly() {
        System.out.println("날 수 없습니다.");
    }

    public static void main(String[] args) {

        Captain captain = new Captain("Lee", 13);
        captain.run();
        captain.fight();
        captain.fly();
    }
}
