import java.util.*;
public class Overloading{
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
     /*  int a,b,c,s;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of a:");
         a=sc.nextInt();
         System.out.println("Enter the value of b:");
         b=sc.nextInt();
         System.out.println("Enter the value of c:");
         c=sc.nextInt();
         s=sum(a,b,c);
         System.out.println("sum is:"+s);*/

         System.out.println(sum(3,5,20));
    }
}