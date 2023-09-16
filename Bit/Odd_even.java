package Bit;

public class Odd_even {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0 ){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        oddEven(8);
        oddEven(15);
        oddEven(78);
        oddEven(999999);
    }
}
