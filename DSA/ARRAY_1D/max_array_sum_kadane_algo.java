package DSA.ARRAY_1D;

public class max_array_sum_kadane_algo {
    public static void kadane_algo(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];
            if(cur_sum<0){
                cur_sum = 0;
            }
            max_sum = Math.max(max_sum, cur_sum);
        }
        System.out.println("max subarray sum is : " + max_sum);
    }

    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane_algo(array);
    }
}
