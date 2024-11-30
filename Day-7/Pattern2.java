import java.util.*;
public class Pattern2 {
    public static void InvertedHalfrectangle(int n){
        int i,j,k;
          for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print("*");
            }
           System.out.println();
          } 
    }
    public static void main(String[] args) {
     InvertedHalfrectangle(5);
    }
}
