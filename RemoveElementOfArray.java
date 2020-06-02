package alogithmBasic;

import java.util.Scanner;

public class RemoveElementOfArray {
    static int inputElement;
    static int[] listNum = {2, 5, 7, 9, 21, 8};

    public static void removeElementOfArray(int a, int[] array){
        int[] newList = new int[listNum.length-1];
        for (int i = 0,k=0; i < array.length; i++) {
            if (a != i) {
                newList[k++] = array[i];
            }
        }
        for (int i= 0;i<newList.length;i++){
            System.out.println(newList[i]);
        }
    }

    public static void Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input element which want to remove:");
        inputElement = input.nextInt();
    }
    public static void main(String[] args) {
        Input();
        removeElementOfArray(inputElement,listNum);
    }
}

