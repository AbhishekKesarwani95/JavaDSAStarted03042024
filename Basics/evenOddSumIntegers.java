package Basics;

import java.util.Scanner;

public class evenOddSumIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        char ch='A';
        for(int i=1;i<=110;i++){
            System.out.println(ch);
            ch++;
        }
        for(int i=1; i<=n;i++){

            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        System.out.println("Even Sum is :"+evenSum +" and Odd Sum is :"+oddSum);
    }
}
