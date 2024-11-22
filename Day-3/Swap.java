public class Swap {
    public static void Swapvalue(int a, int b) { // Change return type to void
        int c;
        c = a;
        a = b;
        b = c;

        // Print swapped values inside the method
        System.out.println("Inside Swapvalue method: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 14;
        Swapvalue(a, b); // Pass values to the method
        System.out.println("In main method: a = " + a + ", b = " + b);
    }
}
