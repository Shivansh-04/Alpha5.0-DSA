package DSA.ARRAY_1D;

public class buy_sell_stock {
    public static int buy_sell(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxPrice = Math.max(maxPrice, profit);
            }
            else{
                buyPrice = arr[i];
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("Max Profit: " + buy_sell(price));
    }
}
