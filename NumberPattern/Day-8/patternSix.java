public class patternSix {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
