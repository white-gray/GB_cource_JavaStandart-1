import java.lang.Math;



public class Main<val5_2, val5_3, val5_1> {
    public static void main(String[] args) {
     //Пункт 2
     // переменные разных типов данных с максимальными значениеями
        byte valueByteMax = 127;
        short valueShortMax = 32767;
        int	valueIntMax = 2147483647;
        long valueLongMax = 9223372036854775807L;
        float valueFloatMax	= 3.4f;
        double valueDoubleMax = 1.7d;
        char valueCharMax = '\uFFFF';
        String valueStringMax = "Max";
        boolean	valueBooleanMax = true;
     // вывод значенией переменных
        System.out.println("максимольное значение типа byte = " + valueByteMax + "\n----------------");
        System.out.println("максимольное значение типа short = " + valueShortMax + "\n----------------");
        System.out.println("максимольное значение типа int = " + valueIntMax + "\n----------------");
        System.out.println("максимольное значение типа long = " + valueLongMax + "\n----------------");
        System.out.println("максимольное значение типа float (без степеней) = " + valueFloatMax + "\n----------------");
        System.out.println("максимольное значение типа double(без степеней) = " + valueDoubleMax + "\n----------------");
        System.out.println("максимольное значение типа char = " + valueCharMax + "\n----------------");
        System.out.println("максимольное значение типа String = " + valueStringMax + "\n----------------");
        System.out.println("максимольное значение типа boolean = " + valueBooleanMax + "\n____________________________________________________________________");
        System.out.println("\n\n____________________________________________________________________\n\n");


     //Пункт 3
     // арифметика
        float a = 1, b=2, c=3, d=b;
        System.out.println("Имеем: a = 1, b=2, c=3, d=b\n Тогда a * (b + (c / d)) = " + count(a,b,c,d));
        System.out.println("\n\n____________________________________________________________________\n\n");


     //Пункт 4
     // проверка суммы
        int val1=(int)(Math.random()*10), val2=(int)(Math.random()*20);
        int summ = val1 + val2;
        System.out.println("Имеем: val1 = " + val1 + ", val2 = " + val2 +".\n Тогда val1+val2 = " + summ + " и это " + checkSumm(val1, val2) + " попадает в интервал от 10 до 20 включитльно");
        System.out.println("\n\n____________________________________________________________________\n\n");



    //Пункт 5
    // проверка положительности числа
    int val5_1 = (int) (Math.random() * 100), val5_2 = (int) (Math.random() * 10);
    if (val5_2 < 5) {
        val5_1 = -val5_1;
    }
    boolean itog5 = checkNegative(val5_1);

    //Пункт 6
    // проверка положительности числа
        System.out.println(" и "  + itog5 + " меньше 0");
        System.out.println("\n\n____________________________________________________________________\n\n");

        //Пункт 7
        // приветствие
        String name = "Максим";
        hello(name);
    }



    /* метод подсчитывает*/public static float count(float a, float b, float c, float d) {
    // метод возвращает результат без печат
        return (a * (b + (c / d))) ;
    }

    // метод суммирует, и сравнивает результат
    public static boolean checkSumm(int a, int b) {
        if ((a+b) <10 | (a+b) > 20) {return false;}
        else {return true;}
    }

    // метод проверки положительности числа и показывает результат
    public static boolean checkNegative (int a) {
        if (a < 0) {
            System.out.println("Имеем: а = " + a + " и это меньше 0");
            return true;
        } else {
            System.out.println("Имеем: а = " + a + " и это больше 0");
            return false;
        }
    }

        // метод приветствуется
        public static void hello (String a) {
            System.out.println("Привет, " + a + "!");
        }

}

