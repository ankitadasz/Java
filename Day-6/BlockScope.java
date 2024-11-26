import java.util.*;

public class BlockScope {
    public static void main(String[] args) {
        int a=10;
        {
            int b=90;
            System.out.println(b);
        System.out.println(a);

        }
        System.out.println(a);
    }
}
