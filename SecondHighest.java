package alogithmBasic;

public class SecondHighest {
    static int[] listNum = {2,5,7,9,21};

    public static void secondHighest(int[] array){
        int max=array[0];
        int max2=0;
        for (int i=0; i<array.length; i++){
            if (array[i]>max){
                max2=max;
                max=array[i];
            }
            else if(max2<array[i] && array[i]<max){
                max2=array[i];
            }
        }
        System.out.print("Second highest value of array is: "+max2);
    }
    public static void main(String[] args) {
        secondHighest(listNum);
    }
}
