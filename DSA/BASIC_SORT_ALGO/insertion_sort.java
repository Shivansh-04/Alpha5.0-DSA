package DSA.BASIC_SORT_ALGO;

public class insertion_sort {
    public static void insertion(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            int perv = i-1;
            while (perv >= 0 && array[perv] > curr) {
                array[perv +1] = array[perv];
                perv--;
            }
            array[perv+1] = perv;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4};
        insertion(arr);
    }
}
