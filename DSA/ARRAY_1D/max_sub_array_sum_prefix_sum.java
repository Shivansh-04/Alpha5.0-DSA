package DSA.ARRAY_1D;

public class max_sub_array_sum_prefix_sum {
    public static int sub_array_prefix(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        int prefix[] = new int[arr.length];
        
        //! calculating prefix
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) { // !tell starting of the sub array
            int start = i;
            for (int j = i; j < arr.length; j++) { // !tell ending of the sub array
                int end = j;
                cur_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(max_sum < cur_sum){
                    max_sum = cur_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int array[] = {1,-2,6,-1,3};
        System.out.println("Maximum sum is: "+sub_array_prefix(array));
    }
}