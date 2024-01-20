package DSA.Array;

public class reverseArray {
    public static void reverse(int number[]){
        int first=0;
        int last=number.length-1;
        while(first<last){
            int temp;
            temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int number[]={2,1,3,4,5,6,9};
        reverse(number);
        System.out.println(number[0]);
    }
}
