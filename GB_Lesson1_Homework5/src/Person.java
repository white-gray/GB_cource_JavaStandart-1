public class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person (String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void personInfo(){
        System.out.println("\tимя: " + name + "\n\t\tдолжность: " + position + "\n\t\te-mail: " + email + "\n\t\tтел.: " + phoneNumber + "\n\t\tуровень ЗП: " +  salary + "\n\t\tвозраст: " + age + "\n");
    }

    public void personInfoUp40age(){
        System.out.println("\tзовут: " + name + ", и получает он "  +  salary);
    }
}
