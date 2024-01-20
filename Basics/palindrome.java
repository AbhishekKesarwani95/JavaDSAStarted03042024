package Basics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pal=n;
        int reverse=0;
        while(n>0){
            int lastDigit=n%10;            
            reverse=reverse *10 +lastDigit;
            n=n/10;
        }
        System.out.println("Reverse of number "+ reverse);
        if(reverse==pal){
            System.out.println("No. is palindrome");
        }
        else{
            System.out.println("No. is not a palindrome");
        }
    }
}
