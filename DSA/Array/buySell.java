package DSA.Array;

public class buySell {
    public static int stocks(int nums[]){
        int maxProfit=Integer.MIN_VALUE;
        int buyPrice=nums[0];
        for(int i=1;i<nums.length;i++){
            maxProfit=Math.max(buyPrice, nums[i]);
            if(maxProfit>buyPrice){
                return maxProfit;
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        int prodit=stocks(nums);
        System.out.println(prodit);
    }
}
