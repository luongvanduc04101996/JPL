
import java.util.Scanner;


public class Bai26 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Nhap N ");
        n = scan.nextInt();
        
        System.out.println("Cac so le nho hon "+n);
        if(n>0)
        {
            for(int i=1;i<n;i++)
            {
                if(i%2==1)
                    System.out.println(i+" ");
            }
        }
        else
            System.out.println("Ban nhap sai dieu kien");
    }
}
