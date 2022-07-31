import java.util.Scanner;

public class PP1_1_4 {
    
    //Siddhi Pandya 21ce086
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b = sc.nextLine();
        int n,count=0;
        if((a.length()-b.length())<0){
            for (int i = 1 ; i<a.length();i++){
                if(a.charAt(i-1)==b.charAt(i-1) && a.charAt(i)==b.charAt(i)){
                    count++;
                }
            }
        }
        else
        {
            for (int i = 1 ; i<b.length();i++){
            if(a.charAt(i-1)==b.charAt(i-1) && a.charAt(i)==b.charAt(i)){
                count++;
            }
        }
        }
//        for (int i = 0 ; i<n;i++){
//            if(a.charAt(i)==b.charAt(i) && a.charAt(i+1)==b.charAt(i+1)){
//               count++;
//            }
//        }
        System.out.println(count);

    }
}
