public class lowercase_vowel {
    public static int LOWERCASE(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                count++;
            }
            if(str.charAt(i) == 'e'){
                count++;
            }
            if(str.charAt(i) == 'i'){
                count++;
            }
            if(str.charAt(i) == 'o'){
                count++;
            }
            if(str.charAt(i) == 'u'){
                count++;
            }
            
        }
        return count;
    } 
    public static void main(String[] args) {
        String str = "SaaaaDeeeeEiiiiRooooGuuuuuW";
        System.out.println(LOWERCASE(str));
    }
}
