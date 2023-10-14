public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    protected Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    protected void eat(Plate p) {
        if ((p.getFood()-appetite)>0) {
            p.decreaseFood(appetite);
            satiety = true;
        }
        else {
            System.out.println("The food in the plate is over!");
        }
    }
    protected String getName () {
        return name;
    }
    protected int getAppetite () {
        return appetite;
    }
    protected boolean getSatiety () {
        return satiety;
    }

}