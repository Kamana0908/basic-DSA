package FlowControls;
import java.util.*;

public class contiprblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Number was:"+num);
        }while(true);
    }
    
}
