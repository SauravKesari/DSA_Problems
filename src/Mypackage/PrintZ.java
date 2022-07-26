package Mypackage;

public class PrintZ {

    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if((i+j)==n-2){
                    System.out.print("*"+" ");
                }
                if(i==0 ||i==n-1) {
                    if(j==n-1)
                    {
                        System.out.print("");
                    }
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }

            }
            System.out.println();
        }

    }
    static int gcd(int num1,int num2){
        if(num2==0)
            return num1;
        else
            return gcd(num2,num1%num2);

    }
}
