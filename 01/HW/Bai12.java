
import java.util.Scanner;


public class Bai12 {
    public static void main(String args[])
    {
        int x,n,s=0;
        System.out.println("Nhap X va N:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        n = scan.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            s+= xMun(x,i);
        }
        System.out.println("S = "+ s);
    }
    public static int xMun(int x,int n)
    {
        return (int) Math.pow(x,n);
    }
}
