public class starTen {
    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = 0; i < n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = i; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
