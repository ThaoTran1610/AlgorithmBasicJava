package alogithmBasic;

import java.util.ArrayList;

public class CheckForPrime {
    static int[] listNum = {2,5,3,8,7};

    static boolean CheckForPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkForPrime(int[] array){
        ArrayList<Integer> prime =new ArrayList<Integer>();
        ArrayList<Integer> notPrime =new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (CheckForPrime(array[i])){
                prime.add(array[i]);
            }
            else
                notPrime.add(array[i]);
        }
        System.out.println("numbers are prime "+prime);
        System.out.println("numbers are not prime "+notPrime);
    }

    public static void main(String[] args) {
        checkForPrime(listNum);

    }
}
