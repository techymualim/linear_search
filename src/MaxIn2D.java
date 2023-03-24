import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][]arr= {
                {2,4,11},
                {23,22,11,99},
                {30,42,11},
                {18,12,22,33}

        };
        System.out.println(maxVal(arr,23));
    }
    static int maxVal(int [][]arr, int target){
        int max_val=Integer.MIN_VALUE;
        for(int row=0;row < arr.length;row++){
            for(int col=0; col < arr[row].length; col++){
                if(arr[row][col] > max_val){
                   max_val=arr[row][col];
                }
            }
        }
        return max_val;
    }
}
