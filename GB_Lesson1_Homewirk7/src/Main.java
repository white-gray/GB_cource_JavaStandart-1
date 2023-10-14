public class Main {
    public static void main(String[] args) {
        Cat cat[] = new Cat[10];
        Plate plate = new Plate(100);
// задаём котов
        for (int i = 1; i<10; i++) {
            cat[i] = new Cat(new String ("Barsik"+i), (i * 3));
        }
// рассматриваем котов всё-таки
        for (int i = 1; i<10; i++) {
            System.out.println("cat("+ i + ") has name is " + cat[i].getName() + " and he has an appetite " + cat[i].getAppetite() + " and now he is " + cat[i].getSatiety() + " satiety");
        }
        System.out.println();

// смотрем сколько у нас еды
        plate.info("We have a plate with food: ");
        System.out.println();

// коты едят
        System.out.println("The cats ate and we saw how");
        for (int i = 1; i<10; i++) {
         cat[i].eat(plate);
        }
        System.out.println();

// смотрем сколько у нас еды
        plate.info("And now we have a plate with food: ");
        System.out.println();

// рассматриваем котов
        for (int i = 1; i<10; i++) {
            System.out.println("Now the " + cat[i].getName() + " and is " + cat[i].getSatiety() + " satiety");
        }
        System.out.println();

// докладываем еды в миску
        plate.setFood(100);

// смотрем сколько у нас еды
        plate.info("We added 100 to plate and now we have a plate with food: ");
    }
}