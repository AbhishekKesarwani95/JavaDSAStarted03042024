package DSA.Array;

public class binarySearch {
    public static int binary(int number[],int key){
        int first=0;
        int last=number.length-1;
        while(first<=last){
            int mid=(first+last)/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,7,8,9,10,11};//we need sorted array to perform binary search
        System.out.println("Key found at index: "+binary(number, 25));
    }
}
