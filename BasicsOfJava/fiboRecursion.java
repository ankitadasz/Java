import java.util.*;
class fiboRecursion{
   static int a=0,b=1,c;
   public static void main(String[] args) {
      System.out.print(a+" "+b+" ");
      fiboRecursion f = new fiboRecursion();
      f.printFib(10);
   }
   void printFib(int n){
        if(n>=1){
         c=a+b; 
         System.out.print(c+" ");
         a=b;
         b=c;
         printFib(n-1);
        
        }
   }
}