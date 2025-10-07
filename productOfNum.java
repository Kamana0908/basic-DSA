package FNCTIONS.METHODS;

public class productOfNum {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        
        int prod = multiply(9, 6);
        System.out.println(prod);
        prod = multiply(30, 49);
        System.out.println(prod);
        
    }
    
}
