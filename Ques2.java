package FlowControls.Problems;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number:");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }

            System.out.println("Do you want to continue? Press 1 for yes and 0 for no:");

            choice=sc.nextInt();

        } while(choice==1);
        
        System.out.println("Sum of even num is :"+ evenSum);
        System.out.println("Sum of odd num is :" + oddSum);
         
    }

    
}
