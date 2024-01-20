package Basics;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                if(i==1|| i==4 || j==1 || j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                /*if(i==1 || i==n){
                    System.out.print("* ");
                }
                if((i==2 || i==3) && (j==1 || j==5)){
                    System.out.print("* ");
                }
                if((i==2 || i==3) && (j==2 || j==3 ||j==4)){
                    System.out.print("  ");
                }*/
                
                
            }
            System.out.println("");
        }
    }
}
