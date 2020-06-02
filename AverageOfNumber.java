package alogithmBasic;

import java.util.Scanner;

public class AverageOfNumber {
    static int a,b,c;

    public static void averageOfNumber(int num1, int num2, int num3){
        float average;
        average= (num1+num2+num3)/3;
        System.out.println("Average of 3 numbers is:"+average);
    }

    public static void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input element which want to calculate for average:");
        System.out.print("Input a:");
        a = input.nextInt();
        System.out.print("Input b:");
        b = input.nextInt();
        System.out.print("Input c:");
        c = input.nextInt();
    }
    public static void main(String[] args) {
        Input();
        averageOfNumber(a,b,c);
    }
}
