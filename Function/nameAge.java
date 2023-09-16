package Function;
import java.util.*;

public class nameAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String myname = sc.nextLine();
        int age = sc.nextInt();
        float income = sc.nextFloat();

        myName(myname, age, income);
    }

    public static void myName(String name, int n, float n2) {
        System.out.println("My name is " + name + " age is " + n + " and income is " + n2);
        return ;

    }
}
