import java.util.*;

public class ArrayArgument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
             System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        int marks[]={90,98,97};
        update(marks);
       
    }
}
