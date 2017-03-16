
import java.util.Scanner;


public class Bai22 {
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap N va M:");
        n = scan.nextInt();
        m = scan.nextInt();
        
        System.out.println("BCNN("+n+","+m+") = "+ (m*n/UCLN(n,m)));
    }
    
    public static int UCLN(int a,int b)
    {
        if(a==0)
            return b;
        else if(b==0)
            return a;
        else if(a>b)
            return UCLN(a%b,b);
        else
            return UCLN(b%a,a);
    }
}
