class ReverseString{
    public static void main(String[] args) {
        String name="NITIN DAS",rev="";
        for(int i=name.length()-1; i>=0 ; i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}