package Basics;
import java.util.*;
public class helloWorld{
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income>1000000){
            tax=(int)(30*(income/100));
        }else if(income>=500000 && income<=1000000){
            tax=(int)(20*(income/100));
        }
        else{
            tax=0*(income/100);
        }
        System.out.println("For Income "+income+" tax should be paid of " +tax );
    }
}