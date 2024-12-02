import java.util.*;
public class Pattern3 {
    public static void InvertedHalfpyramid(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedHalfpyramid(5);
    }
}
