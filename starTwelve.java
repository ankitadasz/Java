public class starTwelve {
    public static void main(String[] args) {
        int i,j,k,n=5;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j||i+j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
