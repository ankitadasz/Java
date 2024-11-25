import java.util.*;
public class BinaryToDecimal {
    public static int BTD(int n){
        int num,pow=0,dec=0;
        while(n!=0){
        num=n%10;
        dec=dec+(num*(int)(Math.pow(2, pow)));
        pow++;
        n=n/10;
        }
       return dec;
    } 
        public static void main(String[] args) {
        System.out.println(BTD(11));
    }
}
