public class Palindrome {
    public static void main(String[] args) {
        int rev = 0, ld, num = 121, pal;
        pal = num;
        while (num != 0) {
            ld = num % 10;
            rev = (rev * 10) + ld;
            num = num / 10;
        }
        System.out.println(pal);
        if (pal == rev) {
            System.out.println(pal + " is palindrome");
        } else {
            System.out.println(pal + " is not a palindrome no");
        }
    }
}
