import java.util.*;
public class Function{

public static void PrintHelloworld(){
    System.out.println("hello world");
    System.out.println("hello world");
    System.out.println("hello world");
    return;
} 


public static int Sumoftwo(int a,int b){
    
      int sum=a+b;
      System.out.println("sum is:"+sum);
      return sum;
}
public static void main(String[] args) {
    int a,b,sum;
    Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
    b=sc.nextInt();
    sum=Sumoftwo(a,b);
    }
}
