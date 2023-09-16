import java.util.Scanner;

public class Sortest_path {
    public static float sortest(String str){
        int x=0 , y=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "WNEENESENNN";
        System.out.println();
        System.out.print("The sortest path is" + sortest(string));
    }
}
