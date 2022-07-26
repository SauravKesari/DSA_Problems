package Mypackage;

import java.util.HashMap;
import java.util.Map;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class Teacher extends Person{
    String specialization;
    double salary;
    Teacher(String name,int age,String specs,double sal){
        super(name,age);
        this.salary=sal;
        this.specialization=specs;
    }
    void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Specs: "+specialization);
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher[] t=new Teacher[2];
        String s="Hello";
        String rev="";
        for (int i = s.length()-1; i>=0 ; i--) {
            rev+=s.charAt(i);
        }
        System.out.println(rev);

        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map.toString());
        for (Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }

    }
}
