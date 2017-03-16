
import java.util.Scanner;


public class Bai19 {
    public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        if(NgTo(n)==1)
            System.out.println(n + " La so nguyen to:");
        else
            System.out.println("Ko phai so nguyen to");
       
    }
    public static int NgTo(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
}
