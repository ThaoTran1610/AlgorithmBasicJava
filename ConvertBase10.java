package alogithmBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertBase10 {
    static  int a;
    public static void convertBase10(int n){
        int[] newArray = new int[100];
        int k=0;
        while (n>0){
            newArray[k++]=n%2;
            n=n/2;
        }
        for (int i=k-1; i>=0; i--){
            System.out.println(+newArray[i]);
        }
    }
    public static void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input base 10 which want to convert:");
        a = input.nextInt();
    }
    public static void main(String[] args) {
        Input();
        convertBase10(a);
    }
}
