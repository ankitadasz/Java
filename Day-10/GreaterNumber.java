import java.util.*;
class GreaterNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
        System.out.println("Enter the value of c:");
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+"is the greter one among"+b+" & "+c);
                }
        else if(b>c && b>a){
            System.out.println(b+"is the greater one among"+a+" & "+c);
        }        
        else{
            System.out.println(c+"is the greater one among"+a+" & "+b);
        }

    }
}