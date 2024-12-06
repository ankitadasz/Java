import java.util.*;
public class PairsArray {
    public static void PairsGet(int arr[]){
        int i,j,curr;
        for(i=0;i<arr.length;i++){
            curr=arr[i];
            for(j=i+1;j<arr.length;j++){
                System.out.println("("+curr+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        PairsGet(arr);
    }
}
