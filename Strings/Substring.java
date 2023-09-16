import java.util.Scanner;

public class Substring {
    public static String sub(String str, int start, int end){
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to find substrings -> ");
        String string = sc.nextLine();
        System.out.print("enter starting index -> ");
        int startingIndex = sc.nextInt();
        System.out.print("enter ending index -> ");
        int endingIndex = sc.nextInt();

        System.out.println(sub(string, startingIndex, endingIndex));
    }
}
