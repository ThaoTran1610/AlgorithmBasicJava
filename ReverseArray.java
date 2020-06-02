package alogithmBasic;

import java.util.ArrayList;

public class ReverseArray {
    static int[] listNum = {2,5,3,8,7};

    public static void reverseArray(int[] array){
        for (int i=array.length-1; i>=0; i--){
            System.out.println(+array[i]);
        }
    }

    public static void main(String[] args) {
        reverseArray(listNum);
    }
}
