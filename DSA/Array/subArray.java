package DSA.Array;

public class subArray {
    public static void printSubArray(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");                    
                    sum+=numbers[k];
                }
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
        int number[]={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        long product=1;
        for(int i=0;i<number.length;i++){
            product*=number[i];
        }
        System.out.println("Product of number is "+product);
    }
}
