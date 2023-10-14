public class Animals {
    public String name;
    public int maxRun, maxSwim;
    public double maxHeight;

    public void run (int length, int time){
        if (length > maxRun) {
            System.out.println("\t\t" + name + " не сможет столько пробежать!");
        }
        else {
            System.out.println(String.format("\t\t%s пробежал(а) дистанцию %s метров за %s", name, length, time));
        }
    }
    public void swim (int length, int time){
        if (length > maxSwim) {
            System.out.println("\t\t" + name + " не сможет столько проплыть!");
        }
        else {
            System.out.println(String.format("\t\t%s проплыл(а) дистанцию %s метров за %s", name, length, time));
        }
    }
    public void jump (double height){
        if (height > maxHeight) {
            System.out.println("\t\t" + name + " не сможет так высоко подпрыгнуть!");
        }
        else {
            System.out.println(String.format("\t\t%s прыгнул(а) на высоту %s метров", name, height));
        }
    }
}
