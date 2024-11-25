import java.util.*;

public class PrintPrime {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {// if the value will be true then it will return the value of i
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primerange(1000);
    }
}
