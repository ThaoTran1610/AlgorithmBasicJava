package alogithmBasic;

public class AverageOfArray {
    static int[] listNum = {2,5,3,8,7};

    static void averageOfArray(int[] array){
        float average = 0;
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        average = sum/array.length;
        System.out.print("Reverse array is: "+average);
    }

    public static void main(String[] args) {
        averageOfArray(listNum);
    }
}
