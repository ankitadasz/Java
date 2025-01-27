public class starSix {
    public static void main(String[] args) {
        int i, j, k, n = 4;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
