public class Dog extends Animals{
    private int maxRun = 500;
    private int maxSwim = 10;
    private double maxHeight = 0.5d;

    public Dog(String name) {
        this.name = name;
        super.maxRun = maxRun;
        super.maxHeight = maxHeight;
        super.maxSwim = maxSwim;
    }

    public Dog(String name, int maxRun, int maxSwim, double maxHeight) {
        this.name = name;
        super.maxRun = maxRun;
        super.maxHeight = maxHeight;
        super.maxSwim = maxSwim;
    }

}
