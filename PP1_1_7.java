import java.util.Scanner;

public class PP1_1_7 {
    
    //Siddhi Pandya 21ce086
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int []a=new int[20];
        for(int i=0;i<8;i++)
        {
            for (int r = 0 ;r<2*(8-i) ;r+=1){
                System.out.print(" ");
            }
            int k=1;
            for(int j=1;j<i+2;j++)
            {
                System.out.print(k+" ");
                a[j]=k;
                k+=k;

            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(a[j]+" ");

            }
            System.out.println();
        }
    }
}
