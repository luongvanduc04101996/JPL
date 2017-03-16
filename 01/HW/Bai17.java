
import java.util.Scanner;


public class Bai17 {
    public static void main(String args[])
    {
        int n,s=0,t=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s+=i;
                t*=i;
            }
        }
        System.out.println("Tong S = "+ s + "\nTich T = "+ t);
    }
    
}
