import java.util.*;
public class Pattern4 {
    public static void FloyidTriangle(int n){
        int i,j,counter=1;
        for(i=1;i<=n;i++){
            for(j=i;j<=2*i-1;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloyidTriangle(5);
    }
}
