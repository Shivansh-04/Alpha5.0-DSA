package Arrays.one_Arrays;

import java.util.Scanner;

public class ass_des {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array :");
        int size =sc.nextInt();
        int value[] = new int[size];

        //! taking input in array
        for (int i = 0; i < value.length; i++) {
            System.out.print("Enter element "+(i+1)+" :");
            value[i] = sc.nextInt();
        }

        //! asigning value to check it is ascending or not
        boolean isAscending = true;

        //! checking whether elements are sorted in ascending manner or not using bubble sort algorithm
        //! bubble sort algorithm -> checking value one after another
        for (int i = 0; i < value.length-1; i++) {
            if (value[i] > value[i+1]) {
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is shorted in Ascending order");
        }
        else{
            System.out.println("The array is not shorted in Ascending order");
        }
    }

    
}
// ---------------------------------------------------------------------------------------------------------so
