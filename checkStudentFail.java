package CONDITIONAL;
import java.util.*;

public class checkStudentFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();
        String status = marks >= 33 ? "Pass" : "Fail";
        System.out.println(status);

    }
    
}
