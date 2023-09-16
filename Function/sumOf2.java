package Function;
import java.util.*;

public class sumOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 -> ");
        int num1= sc.nextInt();
        System.out.print("Enter num2 -> ");
        int num2= sc.nextInt();

        int add = sum(num1, num2);
        System.out.println("The sum of 2 number is " + add);
    }

    public static int sum(int n, int n2){
        int sum = n +n2;
        return sum;
    }
}
