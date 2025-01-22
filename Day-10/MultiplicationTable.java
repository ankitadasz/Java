import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=sc.nextInt();
        for(i = 1 ; i <= 10 ; i++){
            int res=a*i;
            System.out.println(a + " * "+ i +" = "+res);
        }
    }
}
