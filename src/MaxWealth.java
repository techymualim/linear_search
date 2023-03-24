public class MaxWealth {
    public static void main(String[] args) {
    int [][] arr={{1,2,3},{1,2,3,4}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int [][] accounts){
        int total_wealth=Integer.MIN_VALUE;

        for(int person=0;person < accounts.length;person++){
            //when you start a new col, take a num sum for that row
            int sum=0;
            for(int wealth=0;wealth < accounts[person].length; wealth++){
                sum=sum+accounts[person][wealth];
            }
            if(sum > total_wealth){
                total_wealth=sum;
            }
        }
        return total_wealth;
    }
}
