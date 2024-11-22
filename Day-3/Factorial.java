import java.util.*;

public class Factorial {

    public static int fact(int a){
        int i,f=1;
        for(i=1;i<=a;i++){
            f=f*i;   
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=fact(a);
        System.out.println(f);

        }
    }

