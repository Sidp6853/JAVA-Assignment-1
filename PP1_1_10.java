import java.util.Scanner;

public class PP1_1_10 {  
    
    //Siddhi Pandya 21ce086
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Siddhi";
        char a[] =s.toCharArray();

        //System.out.println(a[1]);
        for(int i=0;i<4;i++) {
            a[i]+=3;
            System.out.println(a[i]);
        }
    }
}
