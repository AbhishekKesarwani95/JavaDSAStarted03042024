package DSA.Array;

public class linearSearch {
    public static int linSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5,8,12,54,12,65,89,82,82};
        int index=linSearch(arr,52);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key found at "+index);
        }
        
    }
}
