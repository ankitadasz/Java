import java.util.*;

public class Patterns {
    public static void Hollowrectangle(int r, int c){
        int i,j;
        for(i=1;i<=r;i++){
            for(j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Hollowrectangle(4, 04);
    }
}
