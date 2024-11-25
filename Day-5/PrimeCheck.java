import java.util.*;

public class PrimeCheck {
    public static boolean isPrime(int n){
/*corner case
if n==1*/


       // boolean isPrime=true;
        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
               // isPrime=false;
                return false;
            }
        }
return true;
    }
        public static void main(String[]args){
        System.out.println(isPrime(12));
    }
}
