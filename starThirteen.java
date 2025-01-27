public class starThirteen {
    public static void main(String[] args) {
        int i,j,k,n=5;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i>=1 && j>=1 && i<=3 && j<=3){
                    System.out.print(" ");
                }
                else{
                     System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
