
package DSA.Array;
import java.util.*;

public class largest {
    public static int largInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,6,9,3,5,15,18,12,11,8,7};
        System.out.println("largest in the array " +largInArray(arr));
        
    }
}
