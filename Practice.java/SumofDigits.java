import java.util.*;

public class SumofDigits {
    public static int digitSum(int n){
        int sum=0,ld;
        while(n!=0){
            ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println("Sum is"+" "+sum);
        return sum;
    }
    
    public static void main(String[] args) {
        digitSum(121002);
    }
}
