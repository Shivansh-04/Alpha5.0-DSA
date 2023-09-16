package Function;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial -> ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("invalid number");
            return;
        }
        // !calling the function and passing argument as input from user
        int factr = fact(num);
        System.out.println("The factorial of " + num + " is : " + factr);
    }

    public static int fact(int n){

        if(n < 0){
            System.out.println("Invalid number");
            // break;
            return 0;
        }
        else{
            int facto = 1;
            for (int i = n; i >= 1; i--) {
                facto = facto * i;
            }
            return facto;
        }

        // int facto = 1;
        // for (int i = n; i >= 1; i--) {
        //     facto = facto * i;
        // }
        // // System.out.println(facto);
        // return facto;
    }
}
