import java.util.*;

public class Binomial {

    public static int fact(int a){
        int i,f=1;
        for(i=1;i<=a;i++){
            f=f*i;   
        }
        return f;
    }
    public static void main(String[] args) {
        int n,r,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();
        c=n-r;
        int  factn=fact(n);
       int factr=fact(r);
         c=fact(c);
         int bc;
         bc=n/(r*c);
         System.out.println(bc);

    }
}
