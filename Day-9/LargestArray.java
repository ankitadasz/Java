import java.util.*;
public class LargestArray {
    public static int LargeEle(int arr[],int largest){
        int i;
        for(i=0;i<arr.length;i++){
            largest=arr[0];
            if(largest<arr[i]){
              largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,10};
       int largest= LargeEle(arr, 0);
         System.out.println("largest element is:"+largest);
    }
}
