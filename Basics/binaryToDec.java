package Basics;

public class binaryToDec {

    public static void binaryToDec(int n){
        int pow=0;
        int decN=0;
        while(n>0){
            int lastD=n%10;
            decN=decN +(lastD*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(decN);
    }

    public static void decToBinary(int n){
        int pow=0;
        int binN=0;
        while(n>0){
            int rem=n%2;
            binN=binN + (rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println(binN);
    }
    public static void main(String[] args) {
        decToBinary(8);
        binaryToDec(111);
    }
}
