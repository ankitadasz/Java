 import java.util.*;
 public class BinarySearch{
    public static int BinaryGet(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;}
                else if(arr[mid]<key){
                  start=mid+1;
                }
                else{
                    end=mid-1;
                }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=5;
        int mid=BinaryGet(arr, key);
        System.out.println(key+" "+"is present at position"+" "+(mid+1));
    }
 }
