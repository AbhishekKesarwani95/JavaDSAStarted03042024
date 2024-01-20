package Basics;

import java.util.Scanner;

public class prime {

    public static boolean primeN(int a){
        if(a==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){  
                return false;   
            }
        } 
        return true;          
    }

    public static void primeRanges(int n){
        for(int i=2;i<=n;i++){
            if(primeN(i)){
                System.out.println("Prime no. is " +i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to check whether prime or not : ");
        int a=sc.nextInt();
        System.out.println(primeN(a));
        primeRanges(100);
        
    }
}
