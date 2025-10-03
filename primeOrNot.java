package FlowControls;
import java.util.*;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==2){
            System.out.println("always prime");
        }
        boolean isPrime = true;
        for(int i = 2;i<=num-1; i++ ){//n is multiple of i (i not equal to 1or n)
            if(num%i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
