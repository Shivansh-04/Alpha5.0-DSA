package Patterns;

public class pattern2 {
    public static void main(String[] args) {
        incTriangle(5);
        decTriangle(5);
    }
    
    public static void incTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ") ;
            }
            System.out.println();
        }

            // *
            // * *
            // * * *
            // * * * *
            // * * * * *
    }
    public static void decTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ") ;
            }
            System.out.println();
        }

            // * * * * *
            // * * * *
            // * * *
            // * *
            // *
    }
}
