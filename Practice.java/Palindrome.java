import java.util.*;
public class Palindrome {
    public static void Reverse(int n){
        int rev=0,num;
        int original=n;
        while(n!=0){
        num=n%10;
        rev=rev*10+num;
        n=n/10;
        }
        
        System.out.println(rev);
    
        if(original==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
       Reverse(2212122);
    }
    
}
