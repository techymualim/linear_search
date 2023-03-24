import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr= {
                {2,4,11},
                {23,22,11,99},
                {30,42,11,00},
                {18,12,22,33}

        };
        System.out.println(Arrays.toString(search(arr,23)));
    }
    static int[] search(int [][]arr,int target){

        for(int row=0;row < arr.length;row++){
            for(int col=0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
