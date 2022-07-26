package Mypackage;

public class Singleton {
     private Singleton(){

     }
     private  static Singleton instances;

     public static Singleton getInstances(){
         if(instances==null){
             instances=new Singleton();
         }
         return instances;
     }
}
