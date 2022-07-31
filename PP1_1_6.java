import java.util.Scanner;

public class PP1_1_6 {
    
    //Siddhi Pandya 21ce086
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a[]=new int [10];
        int n,count=0 ;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
            {
                count++;
            }
        }
        System.out.println(count>0);
    }
}
