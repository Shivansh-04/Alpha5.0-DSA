package DSA.ARRAY_1D;

public class linear_search {
    public static int linear(int array[] , int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;
        int result = linear(arr, key);

        if(result == -1){
            System.out.println("No result found");
        }
        else{
            System.out.println("the index of key is \" " + result + " \"");
        }
    }
}
