package PATTERNPART2;

public class invertedPyramid {
    public static void invertedPyramid(int n){
          for(int i=1; i<=n; i++){
            //SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        invertedPyramid(4);
    }
}
