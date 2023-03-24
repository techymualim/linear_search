public class Main {
    public static void main(String[] args) {
    int [] arr={22,1,2,55,23,99};
    int searchEle=linearSearch(arr,23);
        System.out.println(searchEle);

    }

    //search in the array: return the index if item found othewise return -1
    static int linearSearch(int[] arr,int item){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=0;index< arr.length;index++){
            if(arr[index]==item){
                //basically it will search the array for the object
                return index;
            }
        }
    return -1;
    }
}