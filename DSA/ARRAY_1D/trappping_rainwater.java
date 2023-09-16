// !You are given an array of n non-negative integers arr[]. It represents an elevated map where the width of each bar is 1. You have to calculate the amount of water that can be trapped inside it
package DSA.ARRAY_1D;


public class trappping_rainwater {
    public static int rainwater(int array[]) {
        int n = array.length;
        //calculate left max boundary
        int left_max[] = new int[n];
        left_max[0] = array[0];
        for(int i=1; i<n; i++){
            left_max[i] = Math.max(array[i], left_max[i-1]);
        }
        //calculate right max boundary
        int right_max[] = new int[n];
        right_max[n-1] = array[n-1];
        for(int i=n-2; i>=0; i--){
            right_max[i] = Math.max(array[i], right_max[i+1]);
        }
        int trapped_water = 0;
        //loop
        for (int i = 0; i < right_max.length; i++) {
            //water level = min(left max , right max)
            int water_level = Math.min(left_max[i], right_max[i]);
            // trapped water = (water level - height[i]) * width
            trapped_water += water_level - array[i];
        }

        return trapped_water;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(rainwater(height));
    }
}
