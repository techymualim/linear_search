public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={22,1,2,55,23,99};
        int searchEle=linearSearchRange(arr,55,1,4);
        System.out.println(searchEle);

    }

    //search in the array: return the index if item found othewise return -1
    static int linearSearchRange(int[] arr,int item,int start,int end){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=start;index<= end;index++){
            if(arr[index]==item){
                //basically it will search the array for the object
                return index;
            }
        }
        return -1;
    }
}
