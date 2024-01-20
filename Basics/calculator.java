package Basics;

import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);

        if(a<0){
            System.out.println(a + " is negative number");
        }
        else{
            System.out.println(a + " is positive number");
        }
        switch(op){
            case '+': System.out.println(a+b);
                     break;
            case '-': System.out.println(a-b);
                     break;
            case '*': System.out.println(a*b);
                     break;
            case '/': System.out.println(a/b);
                     break;
            case '%': System.out.println(a%b);
                     break;

        }
    }
}
