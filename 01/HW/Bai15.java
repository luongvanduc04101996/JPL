
import java.util.Scanner;


public class Bai15 {
     public static void main(String args[])
    {
        int n,s=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        if(n>=1)
            System.out.println("N! = "+ GiaiThua(n));
        else
            System.out.println("Ko co giai thua:");
        
    }
    
    public static int GiaiThua(int n)
        {
            if(n>1)
                return n*GiaiThua(n-1);
            else
                return 1;
            
        }
}
