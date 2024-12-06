import java.util.*;
public class ReveseArray {
    public static void RevArr(int arr[]){
        int i;
        for(i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        RevArr(arr);
    }
}
