
import java.util.Scanner;

public class Bai11 {
    public static void main(String args[])
    {
        int n,s=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            s+=GiaiThua(i);
        }
        System.out.println("S = "+s);
    }
    
    public static int GiaiThua(int n)
        {
            if(n>1)
                return n*GiaiThua(n-1);
            else if(n==1)
                return 1;
            else
                return n;
        }
}
