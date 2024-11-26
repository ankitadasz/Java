import java.util.*;

public class Average {
    public static int avg(int a,int b,int c){
        int average=(a+b+c)/3;
         return average;
    }
    public static void main(String[] args) {
        int a,b,c,av;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        av=avg(a, b, c);
        System.out.println("avg is"+av);
    }
}
