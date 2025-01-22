import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        int a=10,b=2,result;
        Scanner sc=new Scanner(System.in);
        String sym;
        System.out.println("Enter a desired character for calculation(+ - * /)");
        sym=sc.nextLine();
        switch(sym){
            case "+":
            result=a+b;
            System.out.println("result is :"+result);
            break;
            case "-":
            result=a-b;
            System.out.println("result is :"+result);
            break;
            case "*":
            result=a*b;
            System.out.println("result is :"+result);
            break;
            case "/":
            result=a/b;
            System.out.println("result is :"+result);
            break; 
            default:
            System.out.println("Enter a valid character:!!!!!!!!");
        }

    }
}