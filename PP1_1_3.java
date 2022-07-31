import java.util.Scanner;

public class PP1_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b%10)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
