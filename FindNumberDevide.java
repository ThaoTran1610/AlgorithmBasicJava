package alogithmBasic;

import java.util.ArrayList;

public class FindNumberDevide {

    public static void main(String[] args) {
        int[] listArr = new int[200];
        ArrayList<Integer> listNumber = new ArrayList<>();
        for (int i = 10; i <= listArr.length; i++) {
            if (i%7==0 && i %5 !=0){
                listNumber.add(i);
            }
        }
            System.out.println(listNumber);
    }
}
