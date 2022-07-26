package Mypackage;

public class StaticBlock {
    static int a=6;
    static int b;

    static {
        System.out.println("I am a static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
