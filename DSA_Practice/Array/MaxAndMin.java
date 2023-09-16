package DSA_Practice.Array;

public class MaxAndMin {
    public static int maxmin(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                
            }
            else{
                max = array[i];
                
            }
        }
        int[] result = {max , min};
        return result;
        
    }
    public static void main(String[] args) {
        int Array[] = {1,2,3,4,5,6};
        System.out.println();
        
    }
}
