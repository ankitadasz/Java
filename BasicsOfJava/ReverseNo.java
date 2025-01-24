public class ReverseNo {
    public static void main(String[] args) {
        int num=123,rev=0,ld;
        while(num!=0){
            ld=num%10;
        rev=(rev*10)+ld;
        num=num/10;
       
        }
        
System.out.println(rev);
    }
 
}
