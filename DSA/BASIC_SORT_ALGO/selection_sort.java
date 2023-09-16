package DSA.BASIC_SORT_ALGO;

public class selection_sort {
    public static void selection(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minPosition = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,4,3};
        selection(arr);
    }
}
