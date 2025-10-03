package FlowControls;

public class printRevNum {
    public static void main(String[] args) {
        int rev = 0;
        int n= 987654321;
        while(n>0){
         int lastDigit = n%10;
         rev = (rev *10) + lastDigit;
         n = n/10;
        }
        System.out.println(rev);
    }
    
}
