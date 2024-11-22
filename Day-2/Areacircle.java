import java.util.Scanner;

public class Areacircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float radius;
        float area;
        System.out.println("Enter the value of r:");
        radius=sc.nextFloat();
        area=3.14f*radius*radius;
        System.out.println("area of the circle is:"+area);
    }
    
}
