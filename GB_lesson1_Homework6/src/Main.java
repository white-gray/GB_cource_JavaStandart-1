public class Main {

    public static void main(String[] args) {
        Cat lisa = new Cat("Лиза");
        System.out.println("Кошка Лиза");
        System.out.println("\t плывёт 10м:");
        lisa.swim(10,15);
        System.out.println("\t плывёт 1000м:");
        lisa.swim(1000,10);
        System.out.println("\t бежит 10м:");
        lisa.run(10,5);
        System.out.println("\t бежит 1000м:");
        lisa.run(1000,25);
        System.out.println("\t и пока бежала, встретила препятствие 1.4м");
        lisa.jump(1.4);
        System.out.println("\t а потом увидела препятствие 1000м");
        lisa.jump(1000);

        System.out.println();
        Dog dik = new Dog("Дик");
        System.out.println("Пёс Дик");
        System.out.println("\t плывёт 10м:");
        dik.swim(10,33);
        System.out.println("\t плывёт 1000м:");
        dik.swim(1000,3);
        System.out.println("\t бежит 10м:");
        dik.run(10,23);
        System.out.println("\t бежит 1000м:");
        dik.run(1000,43);
        System.out.println("\t и пока бежал, встретил препятствие 0.3м");
        dik.jump(0.3);
        System.out.println("\t а потом увидел препятствие 1000м");
        dik.jump(1000);

        System.out.println();
        Dog hans = new Dog("Ганс", 1000, 20, 5d);
        System.out.println("Пёс Ганс. Физически оооочень развит!");
        System.out.println("\t плывёт 19м:");
        hans.swim(19,37);
        System.out.println("\t плывёт 21м:");
        hans.swim(21,7);
        System.out.println("\t бежит 900м:");
        hans.run(900,27);
        System.out.println("\t бежит 1001м:");
        hans.run(1001,47);
        System.out.println("\t и пока бежал, встретил препятствие 4.7м");
        hans.jump(4.7);
        System.out.println("\t а потом увидел препятствие 5.7м");
        hans.jump(5.7);

        System.out.println();
        Cat varya = new Cat("Мавринка", 3000, 300);
        System.out.println("Кошка Маврина, она же Варя. Малявка... но делает всё лучше всех!");
        System.out.println("\t плывёт 191м:");
        varya.swim(191,9);
        System.out.println("\t плывёт 1м:");
        varya.swim(1,9);
        System.out.println("\t бежит 2999м:");
        varya.run(2999,29);
        System.out.println("\t бежит 3001м:");
        varya.run(3001,49);
        System.out.println("\t и пока бежала, встретила препятствие 249м");
        varya.jump(249);
        System.out.println("\t а потом увидела препятствие 509м");
        varya.jump(509);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tВот такие вот у нас кошачьи!");
    }
}
