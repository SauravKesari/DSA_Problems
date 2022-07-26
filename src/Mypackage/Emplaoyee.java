package Mypackage;

public class Emplaoyee {
    private int Empid;
    private double salary;
    private String Empname;
    public Emplaoyee(int id,String name,double sal){
        this.Empid=id;
        this.Empname=name;
        this.salary=sal;
    }
    public Emplaoyee(){
        System.out.println("Employee is invoked");
    }
    public void printEmployee(){
        System.out.println(this.Empid);
        System.out.println(this.Empname);
        System.out.println(this.salary);
    }
}
