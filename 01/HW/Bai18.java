
import java.util.Scanner;


public class Bai18 {
     public static void main(String args[])
    {
        int n,s=0,l=0,c=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s++;
                if(n%2==0)
                    c++;
                else
                    l++;
            }
        }
        System.out.println("Co "+s+" uoc so\n"+c+" uoc so chan\n"+l+" uoc so le");
    }
}
