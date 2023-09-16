package Arrays.one_Arrays;

import java.util.Scanner;

public class Searching_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size =sc.nextInt();
        int array[] = new int[size];

        // int array[] = {1,2,3,4,5,6};
        //! input
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        //! search input
        System.out.print("Enter the number to search index : ");
        int search = sc.nextInt();

        //! searching code
        for (int i=0 ;i<array.length;i++){
            if (search == array[i]) {
                System.out.println("The index of "+ search +" is :" +i);
            }
        }
    }
}
