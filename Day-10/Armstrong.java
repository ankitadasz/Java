public class Armstrong {
    public static void main(String[] args) {
        int num=151,arm=0,ld,on;
        on=num;
        while(num!=0){
            ld=num%10;
            arm=arm+(ld*ld*ld);
            num=num/10;
        }
        if(on==arm){
            System.out.println("its an armstrong no");
        }
        else{
            System.out.println("its not an armstrong number");
        }
    }
    
}
