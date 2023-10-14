import java.util.Random;
import java.util.Scanner;
public class Homework4 {
    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int SIZE = (rand.nextInt(7)+3);
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            isMapFull();
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            isMapFull();
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        int testVal = 0;
        // проверка горизонтальных линий
        for (int h = 0; h < SIZE; h++) {
            for (int w = 0; w < SIZE; w++) {
                if (map[h][w]==symb) testVal++;
            }
            if (testVal == SIZE) return true;
            testVal = 0;
        }
        // проверка вертикальных линий
        for (int w = 0; w < SIZE; w++) {
            for (int h = 0; h < SIZE; h++) {
                if (map[h][w]==symb) testVal++;
            }
            if (testVal == SIZE) return true;
            testVal = 0;
        }
        // проверка диагональных линий
        int testVal2 = 0;
        for (int w = 0; w < SIZE; w++) {
                if (map[w][SIZE-w-1]==symb) testVal++;
            if (map[w][w]==symb) testVal2++;
            if (testVal == SIZE || testVal2 == SIZE) return true;
        }
        return false;
    }
    public static void isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return;
            }
        }
        System.out.println("Ничья");
        System.exit(0);
    }
    public static void aiTurn() {
        int x, y, setRaw;
        // находим в каком ряду больше Х
        int [] bestColX = checkBestPlace(DOT_X, DOT_O);
        // находим в каком ряду больше 0
        int [] bestCol0 = checkBestPlace(DOT_O, DOT_X) ;
        // берём в расчёт тот ряд, где больше Х или 0
        if (bestColX [0] > bestCol0 [0]) setRaw = bestColX [1];
        else setRaw = bestCol0 [1];
//        System.out.println("setRaw = " + setRaw);
        // определяем в каком именно ряду комп поставит знак,
        if (setRaw < 10) {
            do {
                x = rand.nextInt(SIZE);
                y = setRaw;
//                System.out.println("setRaw < 10   x = " + x + " , y = " + y);
            } while (!isCellValid(x, y));
        }
        else {
            if (setRaw < 20) {
                do {
                    x = setRaw -10;
                    y = rand.nextInt(SIZE);
//                    System.out.println("setRaw < 20   x = " + x + " , y = " + y);
                } while (!isCellValid(x, y));

            }
        else {
                if (setRaw == 20) {
                    do {
                        x = rand.nextInt(SIZE);
                        y = x;
                    } while (!isCellValid(x, y));

                }
                else {
                        do {
                            x = rand.nextInt(SIZE);
                            y = SIZE - x - 1;
                        } while (!isCellValid(x, y));
                }
            }
        }
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    private static int [] checkBestPlace(char symb1, char symb2) {
//        System.out.println("symb1 = " + symb1 + " , symb2 = " + symb2);
        int testVal;
        int [] best = {0,0};
        testVal = 0;
        // проверка по горизонтаям
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
//                System.out.println("гориз: x = " + x + " , y = " + y + " , map[x][y] = " + map[x][y]);
                if (map[x][y]==symb1) testVal++;
                if (map[x][y]==symb2)  {
                    testVal = 0;
                    break;
                }
            }
            if (testVal > best [0]) {
                best [0] = testVal;
                best [1] = x   ; // здесь запоминается ряд, и это будет < 10, т.к. колонок не более 9ти
            }
            testVal =0;
        }
        // проверка вертикальных линий
        testVal =0;
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
//                System.out.println("верт: x = " + x + " , y = " + y + " , map[y][x] = " + map[y][x]);
                if (map[y][x]==symb1) testVal++;
                if (map[y][x]==symb2)  {
                    testVal = 0;
                    break;
                }
            }
            if (testVal > best [0]) {
                best [0]= testVal;
                best [1] = 10 + x; // здесь запоминается колонка, и это будет от 11 < 19, т.к. колонок не более 9ти
            }
            testVal =0;
        }
        // проверка диагональных линий
        int testVal2;
        testVal = testVal2 = 0;
        for (int w = 0; w < SIZE; w++) {
//            System.out.println("диагональ: w = " + w + " , map[w][SIZE-w-1] = " + map[w][SIZE-w-1]+ " , map[w][w] = " + map[w][w]);
            if (map[w][SIZE-w-1]==symb1) testVal++;
            if (map[w][SIZE-w-1]==symb2) break;
            if (map[w][w]==symb1) testVal2++;
            if (map[w][w]==symb2) break;
        }
        if (testVal >= testVal2) {
            if (testVal > best [0]) {
                best [0] = testVal;
                best [1] = 20; // прописывается 20 для диагонали
            }
        }
        else {
            if (testVal2 > best [0]) {
                best [0] = testVal2;
                best [1] = 21; // прописывается 21 для другой диагонали
            }
        }
//        System.out.println("best [0] = " + best [0] + " , best [1] = " + best [1]);
        return best;
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
