/**
 * This Java class takes user input to create a 2D array, fills it with values, and then prints the
 * original matrix.
 */
package Arrays.two_Arrays;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row number of the array :");
        int row =sc.nextInt();
        System.out.print("enter the col number of the array :");
        int col =sc.nextInt();
        int value[][] = new int[row][col];

        //! input inside the 2d array
        for (int i=0 ;i<value.length;i++){
            for (int j= 0;j < value[i].length;j++){
                System.out.print(i + "," + j + ": ");
                value[i][j] = sc.nextInt();
            }
        }

        //!printing original matrix
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length; j++) {
                System.out.println("The value at " +i + ", " + j +" is " +value[i][j]);
            }
        }
    }
}
