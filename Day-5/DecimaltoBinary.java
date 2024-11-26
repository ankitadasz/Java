import java.util.*;
public class DecimaltoBinary{
    public static void main(String[] args) {
        int n,bin=0,rem,pow=0;
        Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
while(n!=0){
    rem=n%2;
    bin=bin+(rem*(int)Math.pow(10, pow));
    pow++;
    n=n/2;
}  
System.out.println("Binary number is:"+bin);

  }

}