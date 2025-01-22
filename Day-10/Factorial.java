import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int a,fact=1,i;
        System.out.println("Enter the value of a:");
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        for(i = 1 ; i <= a ; i++){
            fact=fact*i;
        }
    System.out.println("factorial is:"+ fact);
    }
}
