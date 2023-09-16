package DSA.ARRAY_1D;


public class reverse_array {
    public static void reverse(int array[]){
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.print("the original array is :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse(arr);
        System.out.print("the reverse array is :- " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
