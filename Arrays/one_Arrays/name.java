/**
 * This Java program takes input for the size of an array and then prompts the user to enter names,
 * which are stored in the array and then printed out with their corresponding index.
 */
package Arrays.one_Arrays;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int size = sc.nextInt();
        String names[] = new String[size];
        
        // !input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        
        //! output
        for (int index = 0; index <size; index++) {
            System.out.println((index+1)+". "+names[index]);
        }
    }
}
