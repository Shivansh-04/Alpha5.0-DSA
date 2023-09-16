package Bit;

public class Get_ith_bit {
    public static int ithBit(int n, int i){
        int Bitmask = 1<<i;
        if((n & Bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(ithBit(10, 2));
    }
}
