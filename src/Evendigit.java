public class Evendigit {
    public static void main(String[] args) {
        int [] arrEven={1,22,333,34344,343888};
        System.out.println(findNumber(arrEven));

    }


    static int findNumber(int[] nums){
        int count=0;
        for (int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }


    static boolean even(int num){

        //this log basically tells us number of digits in a integer
//        int digits=((int)(Math.log10(num)))+1;

        //another way to count digits is to divide it by 10
        int number=num;
        int digits=0;
        while(number >0){
            number=number /10;
            digits++;
        }
        return digits%2==0;
    }
}
