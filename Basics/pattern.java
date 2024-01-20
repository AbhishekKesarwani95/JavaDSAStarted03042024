package Basics;

public class pattern {

    public static void hollowRectangle(int totalRow, int totalColum){
        for(int i=1;i<=totalRow;i++){
            for(int j=1;j<=totalColum;j++){
                if(i==1||j==1||i==totalRow||j==totalColum){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedhalfRotated(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedhalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int n){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print(j);
            }
            
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void starInvertedPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    public static void starPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    public static void printY(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                if(j==1 || j==n-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n-2;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*n-2*i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*i-2;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==5||j==1||j==5 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //hollowRectangle(4,5);
        //invertedhalfRotated(4);
        //invertedhalfPyramid(5);
        //invertedPyramid(3);
        //starInvertedPyramid(5);
        //starPyramid(5);
        //printY(8);
        //Butterfly(4);
        solidRhombus(5);
        //hollowRhombus(5);
        diamond(4);
    }
}
