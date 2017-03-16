
import java.util.Scanner;


public class Bai20 {
      public static void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        if(SoChinhPhuong(n)==1)
            System.out.println(n + " la so chinh phuong");
        else
            System.out.println("Ko phai so chinh phuong");
    }
      public static int SoChinhPhuong(int n)
      {
          for(int i=2;i<=n/2;i++)
          {
              if(i*i==n)
                  return 1;
          }
          return 0;
                 
      }
}
