import java.util.Scanner;

public class PP1_1_5
{
    
    //Siddhi Pandya 21ce086
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b= sc.next();
        for(int i=0;i<4;i++)
        if(a.charAt(i)!=b.charAt(0))
        {
            System.out.print(a.charAt(i));
        }



    }
}
