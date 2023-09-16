package DSA.ARRAY_1D;

public class pair_in_an_array {
    public static void pair(int array[]){
        int tp = 0;
        for (int i = 0; i < array.length; i++) {
            int cur=array[i];
            for (int j = i+1; j < array.length; j++) {
                System.out.print("(" + cur + "," + array[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The total pair of pairs are :- " + tp);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pair(arr);
    }
}
