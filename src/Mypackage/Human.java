package Mypackage;

public class Human {
    String name;
    int age;
    double salary;
    static long  population;

    public Human(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population+=1;
    }
}
