package Basics;

import java.util.Scanner;

public class weekDays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the no. between 1 to 7 to print the weekdays");
        /*int n=sc.nextInt();

        if(n%4==0 && (n%100!=0 || (n%400==0 && n%100==0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }*/
        
        while(true){
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
           /* switch (n) {
                case 1: System.out.println("Sunday");
                    
                    break;
                case 2: System.out.println("Monday");
                    
                    break;
                case 3: System.out.println("Tuesday");
                    
                    break;
                case 4: System.out.println("Wednesday");
                    
                    break;
                case 5: System.out.println("Thursday");
                    
                    break;
                case 6: System.out.println("Friday");
                    
                    break;
                case 7: System.out.println("Saturday");
                    
                    break;
            
                default: System.out.println("You have entered "+n+", Please enter the no. between 1 to 7");

                    break;
            }*/
        }
        

    }

