package DSA.Array;

public class tappingRainWater {
    public static void tapRain(int nums[]){
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];  
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];      
        for(int i=1;i<nums.length;i++){
           left[i]=Math.max(nums[i],left[i-1]);
            
        }
        System.out.println();

        for(int i=nums.length-2;i>=0;i--){
            right[i]=Math.max(nums[i],right[i+1]);
            
        }
        
        int totaltrapped=0;

        for(int i=0;i<nums.length;i++){
            int waterlevel=Math.min(left[i],right[i]);
            totaltrapped+=waterlevel-nums[i];
            System.out.println(totaltrapped);
        }
        
        

    }
    public static void main(String[] args) {
        int nums[]={4,2,0,6,3,2,5};
        tapRain(nums);
    }
}
