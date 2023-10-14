import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random age = new Random();
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "инженер", "IvivanI@company.com", "1234567", 50000, (30+age.nextInt(30)));
        persArray[1] = new Person("Петров Пётр", "инженер похуже", "PetrovP@company.com", "2345678", 30000, (30+age.nextInt(30)));
        persArray[2] = new Person("Закин Гер", "да просто", "ZakinG@company.com", "3456789", 3000000, (30+age.nextInt(30)));
        persArray[3] = new Person("Проба Фёдр", "манагер", "ProbsP@company.com", "4567890", 300000, (30+age.nextInt(30)));
        persArray[4] = new Person("Ответный Сергей", "ответственный", "OtvetnyiyS@company.com", "5678901", 130000, (30+age.nextInt(30)));

        System.out.println("В нашей прекрасной компании трудятся сотрудники: ");
        for (int i=0; i<persArray.length; i++) {
            persArray[i].personInfo();
        }


        System.out.println();
        System.out.println("И вот этим товарищам из них уже больше сорока: ");
        for (int i=0; i<persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].personInfoUp40age();
            }
        }
    }
}
