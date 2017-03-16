
import java.util.Scanner;


public class Bai25 {
     public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap Nam:");
        n = scan.nextInt();
    
        if(n%4==0||n%400==0)
        {
            if(n%100==0)
                System.out.println("Ko phai nam nhuan");
            else
                System.out.println("La nam nhuan");
        }
    }
}
