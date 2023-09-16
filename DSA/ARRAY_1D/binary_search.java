package DSA.ARRAY_1D;

public class binary_search {
    public static int binary_code(int array[], int key) {
        int start = 0;
        int end = array.length-1;
        while (start <= end) {
            
            int mid = (start+end)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                start = mid+1;
            }
            if(array[mid] > key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] ={2,4,6,8,10,12,14};
        int key = 10;
        int output = binary_code(arr, key);
        if(output == -1){
            System.out.println("Index of " + key + " not found");
        }
        else{
            System.out.print("The index of "+ key +" is: " + output);
        }
    }
}
