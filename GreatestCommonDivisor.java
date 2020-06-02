package alogithmBasic;

import java.util.Scanner;

public class GreatestCommonDivisor {
    static int a,b;

    static int UCLN(int num1, int num2){
        if (num2==0){
            return num1;
        }
        int ucln = UCLN(num2, num1 % num2);
        return ucln;
    }

    public static void Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a:");
        a = input.nextInt();
        System.out.print("Input b:");
        b= input.nextInt();
    }

    public static void main(String[] args) {
        Input();
        System.out.println("UCLN of 2 numbers is: "+UCLN(a,b));
    }
}
