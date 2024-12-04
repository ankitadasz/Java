import java.util.*;

public class LinearSearch {

    public static void LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("the key" + key + "is present at the place" + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int key = 6;
        LinearSearch(arr, key);
    }
}
