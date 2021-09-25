package top.com.zsy.array;

public class Arraydemo {
    public int getSum(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum +=i;
        }
        return sum;
    }
}
