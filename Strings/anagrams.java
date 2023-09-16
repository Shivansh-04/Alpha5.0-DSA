import java.util.Arrays;

public class anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        return Arrays.equals(str1CharArray, str2CharArray);
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams of each other");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}
