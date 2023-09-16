package Function;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number -> ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number -> ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number -> ");
        int num3 = sc.nextInt();

        int avgrr = agfOf3(num1, num2, num3);
        System.out.println(" the avg of " + num1 + " , " + num2 + " and " + num3 +" is "+avgrr);
    }

    public static int agfOf3 (int n1, int n2, int n3){
        int avgr = (n1+n2+n3) / 3;
        return avgr;
    }
}
