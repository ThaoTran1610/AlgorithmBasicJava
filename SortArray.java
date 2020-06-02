package alogithmBasic;

import java.util.ArrayList;

public class SortArray {
    static int[] listNum = {2,5,3,8,7};

    static void sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(+array[i]);
        }
    }

    public static void main(String[] args) {
            sortArray(listNum);
    }
}
