package Arrays.one_Arrays;

public class marks {
    public static void main(String[] args) {
        int[] marks = new int[4];
        
        marks[0] = 45;
        marks[1] = 48;
        marks[2] = 49;

        System.out.println(marks[0]);
        // System.out.println(marks[2]);
            // for (int i = 0; i < marks.length; i++) {
            //     System.out.println(marks[i]);
            // }

        marks[0] = marks[0]+5;
        System.out.println(marks[0]);
    }
}


/*
if we want to make whole list print we use for loop mostly
 */