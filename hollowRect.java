package PATTERNPART2;

public class hollowRect {
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop 
        for(int i=1; i<=totRows; i++){
            //inner loops-columns
            for(int j=1; j<=totCols;j++){
                //cell-(i,j)
                if(i == 1 || i==totRows || j==1 || j==totCols ){
                    //boundary conditions
                    System.out.print("*");
                
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
         
    }
   public static void main(String[] args) {
    hollow_rectangle(7, 8);
   } 
}
