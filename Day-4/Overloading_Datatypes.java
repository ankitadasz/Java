import java.util.*;

public class Overloading_Datatypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3.2f,2.5f));
    }
}
