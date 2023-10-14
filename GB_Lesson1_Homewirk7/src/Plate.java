public class Plate {
    private int food;

    protected Plate(int food) {
        this.food = food;
    }

    protected void decreaseFood(int n) {
        food -= n;
    }

    protected void info(String n) {
        System.out.println(n + food);
    }

    protected int getFood() {
        return food;
    }
    protected void setFood(int n) {
        food += n;
    }
}