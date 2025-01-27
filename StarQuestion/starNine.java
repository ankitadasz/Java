public class starNine {
    public static void main(String[] args) {
        int i,j,k,n=5;
        for(i=0;i<n;i++){
            for(k=0;k<i;k++){
                System.out.print(" ");
            }
            for(j=i;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
