package MineralCalculator;

class Gold implements Mineral{
    @Override
    public int getValue() {
        return 100;
    }
}

class Silver implements Mineral{
    @Override
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineral{
    @Override
    public int getValue() {
        return 80;
    }
}

class Diamond implements Mineral{
    @Override
    public int getValue() {
        return 200;
    }
}

class MineralCalculator {
    int value = 0;

    int add(Mineral mineral){
        return this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }

}

public class Sample {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        cal.add(new Diamond());

        System.out.println(cal.getValue());
    }
}