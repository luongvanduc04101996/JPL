
import java.util.Scanner;


public class Bai27 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Nhap N ");
        n = scan.nextInt();
        
        System.out.println("Cac so le nho hon "+n+" va khac 7,21,41:");
      
        
        for(int i=1;i<n;i++)
        {
          if(i%2==1&&i!=7&&i!=21&&i!=41)
              System.out.print(i+" ");
        }
    }
}
