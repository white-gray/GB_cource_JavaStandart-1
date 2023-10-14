public class Cat extends Animals{
    private int maxRun = 200;
    private double maxHeight = 2d;

    public Cat(String name) {
        this.name = name;
        super.maxRun = maxRun;
        super.maxHeight = maxHeight;
    }
    public Cat(String name, int maxRun, double maxHeight) {
        this.name = name;
        super.maxRun = maxRun;
        super.maxHeight = maxHeight;
    }

    @Override
    public void swim (int length, int time){
        System.out.println("\t\tКоты плавают false");
    }
}
