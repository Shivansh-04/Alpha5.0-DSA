package DSA.BASIC_SORT_ALGO;

public class Bubble_sort {
    public static void Bubble(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(swap);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        Bubble(array);
    }
}
