package DSA.Array;

public class subArrayPrefix {
    public static void printSubArray(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            
            for(int j=i;j<numbers.length;j++){
                
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];

                /*for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");                    
                    sum+=numbers[k];
                }*/
                System.out.print("& sum ="+sum);
                if(sum>max){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max among these"+max);
        System.out.println("Min among these is "+min);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8,9};
        printSubArray(numbers);
        
    }
}
