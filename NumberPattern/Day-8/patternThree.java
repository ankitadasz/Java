public class patternThree {
    public static void main(String[] args) {
        int i,j,count=0,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                count=count+1;
                System.out.print(" "+count);
            }
            System.out.println();
        }
    }
}
