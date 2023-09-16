package Arrays.one_Arrays;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :");
        int size =sc.nextInt();
        int maxmin[] = new int[size];

        //! taking array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element "+(i+1)+" :");
            maxmin[i] = sc.nextInt();
        }

        //! decelaring min and max value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //! code for finding min and max value
        for (int i = 0; i < size; i++) {
            if (maxmin[i] < min){
                min = maxmin[i];
            }
            if (maxmin[i] > max){
                max = maxmin[i];
            }
        }
        System.out.println("The max number is :" + max);
        System.out.println("The min number is :" + min);
    }
}
