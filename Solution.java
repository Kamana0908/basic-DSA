import java.util.Scanner;

class Solution {

    public static void printNumber(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int number = sc.nextInt();   // ✅ read an int from user

        // call method correctly
        Solution.printNumber(number);   // ✅ passing int, not Scanner

        sc.close();
    }
}

