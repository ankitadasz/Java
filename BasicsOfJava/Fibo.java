public class Fibo {
    public static void main(String[] args) {
        int n = 5, i, a = 0, b = 1, c;
        System.out.println("a:" + a);
        for (i = 0; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
    }

}
