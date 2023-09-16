package Arrays.one_Arrays;
import java.util.*;

public class largest {

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(largest < num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numArray[] = {1,2,6,5,3};
        System.out.println("The largest number is : " + getLargest(numArray));
    }
}
