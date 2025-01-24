import java.util.*;
 class FactorialRecursion{
    int fact=1;
   public static void main(String[] args) {
    int no=5,result;
    FactorialRecursion f = new FactorialRecursion();
    result=f.calFact(no);
    System.out.println("Result is:"+ result);

   } 
   int calFact(int no){
    if(no>1){
        fact=fact*no;
        calFact(no-1);
        
    }
    return fact;
   }
}
    