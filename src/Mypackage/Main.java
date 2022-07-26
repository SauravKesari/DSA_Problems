package Mypackage;

public class Main {
    public static void main(String[] args) {
//        Student s=new Student();
//        Student s1=new Student(55,"Mukesh Sharma",89.8f);
//        System.out.println(s1.roll);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);
//
//        //we can't reassign the value of object
//        final Student s3=new Student();
//        System.out.println(s3.roll);
//        System.out.println(s3.name);
//        Student s4=new Student();
//        System.out.println(s4.roll);
//        final  int g=10;
//        System.out.println(g);
//        Integer a=45;
//        int b=a;

        Singleton s=Singleton.getInstances();

        Singleton s1=Singleton.getInstances();

    }
}
//class Student{
//    int roll;
//    String name;
//    float marks;
//
//    Student(){
//        this.roll=13;
//        this.name="Saurav";
//        this.marks=87.8f;
//    }
//    Student(int roll,String name,float marks){
//        this.roll=roll;
//        this.name=name;
//        this.marks=marks;
//    }
//}
