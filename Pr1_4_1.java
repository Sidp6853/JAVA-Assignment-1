import java.util.Scanner;
public class Pr1_4_1 {
    public static void main(String[] args) {
        
        //Siddhi Pandya 21ce086
        Scanner sc=new Scanner (System.in);
        int count[]=new int[11];
        String a[][]=new String[11][11];
        String b[]=new String [11];
        for(int i=1;i<=8;i++)
        {
            System.out.println("Student "+i);
            for(int j=1;j<=10;j++)
                a[i][j] = sc.next();
        }
        System.out.println("Enter the Answer key");
        for(int i=1;i<=10;i++)
        {
            b[i]=sc.next();
        }
        for(int i=1;i<=8;i++)
        {
            for (int j = 1; j <= 10; j++)
            {
               if(a[i][j].equals(b[j]))
               {
                   count[j]++;
                //   System.out.println(count[j]);
               }
            }
        }
        for(int i=1;i<=8;i++)
            System.out.println("Marks of Student["+i+"]  :"+count[i]);
        }
    }

