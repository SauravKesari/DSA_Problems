package Mypackage;

public class StaticExample {
    public static void main(String[] args) {
        Human Saurav=new Human("Saurav",22,85479);
       // Human Suraj=new Human("Suraj",22,87485);

        System.out.println(Human.population);
        //System.out.println(Suraj.population);



        //greeting is not static method so to call it you have to use instance of class
        // you can not call non-static stuff in static method without explicitly mentioning the reference of instance
        StaticExample s=new StaticExample();
        s.greeting();

    }
    void greeting(){
        System.out.println("Hello");
    }
}
