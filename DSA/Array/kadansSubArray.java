package DSA.Array;

public class kadansSubArray {

    public static void kadans(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int checkNeg=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<0){
                checkNeg++;
            }
        }
        if(checkNeg==num.length){
            for(int i=0;i<num.length;i++){
                cs=cs+num[i];
                ms=Math.max(cs,ms);
                System.out.println(ms);
            }
        }
        else{
            for(int i=0;i<num.length;i++){
                cs=cs+num[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
                System.out.println(ms);
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={4,2,3,3,4,5,-4};
        kadans(nums);
    }
}
