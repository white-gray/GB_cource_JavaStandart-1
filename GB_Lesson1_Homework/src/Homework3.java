import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        boolean end = false;
        int back;
        do {
            System.out.println("И опять ПРИВЕТ !");
            playGame();
            System.out.println("Повторим игру еще разок?\n      1 – да / 0 – нет");
            back = enterDigit();
        }
        while (back == 1);
        System.out.println("Покааааа!");
    }

    private static void playGame() {
        int limit = 10;
        int randNumber = randNumb(limit);
        System.out.println("Загадано число от 0 до 9. Угадаете? У вас 3 попвтки.");
        for (int attampt = 1; attampt < 4; attampt++) {
            System.out.println("Попытка " + attampt + "");
            System.out.println("Ваш вариант: ");
            int answer = enterDigit();
            if (answer == randNumber) {
                System.out.println("Ах как же доГад-ка!");
                break;}
            if (answer > randNumber) {
                System.out.println("сЛишкОм! Умерьте свои аппетиты!!!");
            }
            if (answer < randNumber) {
                System.out.println("И это всё, что вы предлагаете?! Маловато будет!!!");
            }

        }
    }


    private static int enterDigit() {
        Scanner enter = new Scanner(System.in);
        int answer = enter.nextInt();
        return answer;
    }


    private static int randNumb(int limit) {
        Random random = new Random();
        int number = random.nextInt(limit);
        return number;
    }

}
