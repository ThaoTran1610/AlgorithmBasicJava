package alogithmBasic;

public class Fibonacci {

    public static int Fibonacci(int n){
        if (n<0){
            return -1;
        }
        else if(n==0||n==1){
            return n;
        }
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.println(Fibonacci(i));
        }
    }
}
