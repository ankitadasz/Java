import java.util.*;
public class products {

    public static int Product(int a,int b){
        int p;
        p=a*b;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=Product(a,b);
        System.out.println(p);
    }
}
