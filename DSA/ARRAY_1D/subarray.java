package DSA.ARRAY_1D;

public class subarray {
    public static void sub(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int j2 = start; j2 <= end; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total sub array are :- " + ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        sub(arr);
    }
}
