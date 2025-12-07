package TUF.basics;

import java.util.Scanner;

public class reversenum {
    public static int reverse(int num){
        int revNum = 0;
        while(num > 0){
           int lastDigit = num % 10;
           revNum = (revNum * 10) + lastDigit;
           num = num / 10;
          
        }
        return revNum;   
    }

    
    public static void main(String[] args) {
        System.out.println("Enter the num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = reverse(num);
        System.out.println("Reversed Number: " + reversed);
        if(num == reversed){
            System.out.println(num + " is a Palindrome");
        }else{
            System.out.println(num + "Not a palindrome");
        }
      
    }
    
}
