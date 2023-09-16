package Arrays.two_Arrays;

import java.util.Scanner;

public class twoD_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row number of the array :");
        int row = sc.nextInt();
        System.out.print("enter the col number of the array :");
        int col = sc.nextInt();
        int value[][] = new int[row][col];

        // ! input inside the 2d array
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                System.out.print(i + "," + j + ": ");
                value[i][j] = sc.nextInt();
            }
        }

        // ! search input
        System.out.print("Enter number to search :");
        int search = sc.nextInt();

        // ! searching inside the 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (search == value[i][j]) {
                    System.out.println("the searched number found at " + i + " , " + j);
                    break;
                } else {
                    System.out.println("Searched number not found");

                }
            }
        }
    }
}
