package DSA.ARRAY_1D;

public class largest_number {
    public static int largest(int array[]){
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(min<array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,300,5,32,65,78};
        int max = largest(arr);
        System.out.println("\" " + max + " \"" + " is the largest value");
    }
}
