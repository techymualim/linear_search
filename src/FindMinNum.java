public class FindMinNum {

    public static void main(String[] args) {
        int [] arr={12,7,13,55};
        System.out.println(findMin(arr));
    }

    static int findMin(int [] arr){

        // we basically put the max value here, and it is comparing every item with the max value
        // when it find the item smaller then the max value, it replaces it with that. that how it find the minimum value
        int min=Integer.MAX_VALUE;
        for(int i :arr){
            if(i < min){
                min=i;
            }
        }
        return min;
    }
}
