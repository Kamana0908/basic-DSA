package FNCTIONS.METHODS;

public class swapping {
    public static void swap(int a, int b) {
         //Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a ="+a );
        System.out.println("b = "+b);
        
    }
    public static void main(String[] args) {
        //Call by value
        //Java always calls by value
        
        int a=10;
        int b = 20;
        swap(a, b);
       

    }
    
}
