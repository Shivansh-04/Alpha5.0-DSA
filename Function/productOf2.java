package Function;
import java.util.Scanner;

public class productOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int mul = multiply(num1, num2);
        System.out.println("The product of 2 num is " + mul);
    }

    public static int multiply(int n, int n2){
        int product = n * n2;
        return product;
    }
}
