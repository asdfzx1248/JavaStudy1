package top.com.zsy.day1;

public class BubbleSort {
    public static void bubbleSort(int[] a, int b) {
        int i,j;
        for (i =0; i< b; i++){
            for (j = 1; j< b - i; j++){
                if (a[j-1]>a[j]){
                    int temp;
                    temp = a[ j - 1];
                    a[j - 1] =a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,0,9,3,12,7,8,3,4,65,22};
        BubbleSort.bubbleSort(arr,arr.length);
        for (int i :arr){
            System.out.print( i +",");
        }
    }
}
