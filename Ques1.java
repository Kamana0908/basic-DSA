package CONDITIONAL.Problems;
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        String numtype = num>=0 ? "Posiive" : "negative";
        System.out.println(numtype);
    }
    
}
