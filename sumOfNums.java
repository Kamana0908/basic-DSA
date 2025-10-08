package FNCTIONS.METHODS;

import java.util.Scanner;

public class sumOfNums {
    public static int calculateSum(int a, int b){//parameters or formal parameters
        int sum = a+b;
        System.out.println("Sum is :"+sum);
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);//Arguments or actual parametes
      


        
    }
    
}
