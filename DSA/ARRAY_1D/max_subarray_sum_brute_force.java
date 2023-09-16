package DSA.ARRAY_1D;

public class max_subarray_sum_brute_force {
    public static int sub_array_bruteForce(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < arr.length; i++) { // !tell starting of the sub array
            int start = i;
            for (int j = i; j < arr.length; j++) { // !tell ending of the sub array
                int end = j;
                cur_sum = 0;
                for (int j2 = start; j2 <= end; j2++) { // !print all the element between the start and end
                    cur_sum = cur_sum + arr[j2];
                }
                System.out.println(cur_sum);
                if(max_sum < cur_sum){
                    max_sum = cur_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println("The max sum of the given array is : " + sub_array_bruteForce(arr));
    }
}
