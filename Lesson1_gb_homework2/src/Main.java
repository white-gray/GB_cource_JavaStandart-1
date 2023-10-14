import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        // Пункт 1
        // создаётся массив
        System.out.println("Paragraph 1");
        int arraySize = 9;
        int[] BiArray = makeArray1(arraySize);
        System.out.print("We have an array: ");
        for (int i = 0; i < BiArray.length; i++) {
            System.out.print(BiArray[i]);
        }
        System.out.println();

        // миррорится массив и выводится разультат
        System.out.print("We have mirrored the array, and now we have: ");
        for (int i = 0; i < BiArray.length; i++) {
            BiArray[i]--;
            if (BiArray[i] < 0) {
                BiArray[i] = 1;
            }
            System.out.print(BiArray[i]);
        }
        System.out.println("\n");


        // Пункт 2
        // создаём  массив и выводим его на экран
        System.out.println("Paragraph 2");
        int[] Array2 = new int[8];
        int arrValue = 0;
        System.out.print("We have an array: ");
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = arrValue;
            arrValue = arrValue + 3;
            System.out.print(Array2[i] + "  ");
        }
        System.out.println("\n");


        // Пункт 3
        // создаётся  массив и выводится на экран
        System.out.println("Paragraph 3");
        int[] Array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("We have an array: ");
        for (int i = 0; i < Array3.length; i++) {
            System.out.print(Array3[i] + "  ");
        }
        System.out.println();
        // все значения меньше 6, увеличиваются на 2; и массив выводитсям его на экран
        System.out.print("We looked at this array, in all elements less than 6, increased by 2; and now we have an array: ");
        for (int i = 0; i < Array3.length; i++) {
            if (Array3[i] < 6) {
                Array3[i] = Array3[i] * 2;
            }
            System.out.print(Array3[i] + "  ");
        }
        System.out.println("\n");


        // Пункт 4
        // создаётся двухмерный массив и выводится на экран
        System.out.println("Paragraph 4");
        Random rand = new Random();
        int arraySize4 = rand.nextInt(21);
        int[][] Array4 = new int[arraySize4][arraySize4];
        System.out.println("We have an array: ");
        for (int h = 0; h < Array4.length; h++) {
            for (int w = 0; w < Array4.length; w++) {
                if (w == h | w == (arraySize4 - h - 1)) {
                    Array4[h][w] = 1;
                }
                System.out.print(Array4[h][w]);
            }
            System.out.println();
        }
        System.out.println("\n");


        // Пункт 5
        // создаётся массив и выводится его на экран. Отслеживаются min и max значения, и показываются.
        System.out.println("Paragraph 5");
        int arraySize5 = rand.nextInt(21);
        int[] Array5 = new int[arraySize5];
        System.out.println("We have an array: ");
        int min6 = 2147483647, max6 = 0;
        for (int i = 0; i < Array5.length; i++) {
            Array5[i] = rand.nextInt(2147483647);
            System.out.print(Array5[i] + "  ");
            if (Array5[i] < min6) {
                min6 = Array5[i];
            }
            if (Array5[i] > max6) {
                max6 = Array5[i];
            }
        }
        System.out.println();
        System.out.println("   Minimum value here " + min6);
        System.out.println("   Maximum value here " + max6);
        System.out.println("\n");

        // Пункт 6
        // создаётся массив.
        System.out.println("Paragraph 6");
        int arraySize6 = rand.nextInt(21)+2;
        int[] Array6 = new int[arraySize6];
        System.out.println("We have an array: ");
        for (int i = 0; i < Array6.length; i++) {
            Array6[i] = rand.nextInt(3);
            System.out.print(Array6[i] + "  ");
        }
        System.out.println();
        List<Object> checkBallance = checkBallance(Array6);
        System.out.println("   In there array is " + checkBallance.get(0) + " a ballance");

        if (checkBallance.get(0).equals(true)) {
            for (int i = 0; i < Array6.length; i++) {
                System.out.print(Array6[i] + "  ");
                if (i==(int)checkBallance.get(1)) {
                    System.out.print( " || ");}
            }
        }
        System.out.println("\n");


        // Пункт 7
        // создаётся массив.
        System.out.println("Paragraph 7");
        int arraySize7 = rand.nextInt(21+2);
        int[] Array7 = new int[arraySize7];
        System.out.println("We have an array: ");
        for (int i = 0; i < Array7.length; i++) {
            Array7[i] = rand.nextInt(9);
            System.out.print(Array7[i] + "  ");
        }
        System.out.println();
        // определяем насколько и в какию сторону будет смещаться массив
        int slide = -7;
        boolean sign = rand.nextBoolean();
        System.out.println("This array slide at " + slide + " positions");
        // рассчитывается "сдвинутый" массив
        int[] ArrayEnd = new int[arraySize7];
        ArrayEnd = slideArray (Array7, slide);
        System.out.println("And now we have an array: ");
        for (int i = 0; i < ArrayEnd.length; i++) {
            System.out.print(ArrayEnd[i] + "  ");
        }







    }

    private static int [] slideArray(int[]Array7, int slide) {
        if (slide<0) {
            slide = - slide;
            for (int q = 1; q <= slide ; q++) {
                int first = Array7[0];
            for (int i = 1; i < Array7.length; i++) {
                Array7[i-1] = Array7[i];
            }
                Array7[Array7.length-1] = first;
            }
            ;}
        else if (slide > 0) {
                for (int q = 1; q <= slide; q++) {
                    int last = Array7[Array7.length - 1];
                    for (int i = (Array7.length - 2); i >= 0; i--) {
                        Array7[i + 1] = Array7[i];
                    }
                    Array7[0] = last;
                }
                ;
            }
        return Array7;
    }

    private static int[] makeArray1(int arraySize) {
        Random rand = new Random();
        int[] Array = new int[arraySize];
        for (int i = 0; i < (Array.length - 1); i++) {
            Array[i] = rand.nextInt(2);
        }
        return Array;
    }

    private static List<Object> checkBallance(int[] Array) {
        int summLeft = Array [0], summRight = Array [Array.length-1], left=0, right=Array.length-1;
        while (left+1 != right){
            if (summLeft > summRight) {
                right--;
                summRight += Array [right];
                continue;
            }
            if (summLeft <= summRight) {
                left++;
                summLeft += Array [left];
                continue;
            }
            left++;
        }
        if (summLeft==summRight) {return Arrays.asList(true, left);}
        return Arrays.asList(false);
    }



// It's and
}
