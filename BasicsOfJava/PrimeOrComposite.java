public class PrimeOrComposite {
    public static void main(String[] args) {
        int num=10,i,count=0;
        for(i=2;i<num ; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(num+"is a prime number");
        }
        else{
            System.out.println(num+"is a composite number");
        }
    }
    
}
