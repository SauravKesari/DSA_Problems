package Mypackage;

public class StaticClass {
    static class A{
        String name;
        A(String name){
            this.name=name;
        }

    }

    //inner class should be static to access that using it's object
    //Outsider class can't be static because it can't be independent from outside
    public static void main(String[] args) {
        A obj=new A("Kunal");
        A o=new A("Rahul");

        System.out.println(obj.name);
        System.out.println(o.name);

        System.out.println();
    }

    @Override
    public String toString() {
        return "hell";
    }
}
