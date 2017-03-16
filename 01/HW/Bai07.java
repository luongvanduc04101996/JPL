
import java.util.Scanner;


public class Bai7 {
    public static void main(String args[]){
        int n;
        double s=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        if(n>=1)
        {
            for(int i=1;i<=n;i++)
            {
                s+=(double)i/(i+1);
            }
            System.out.println("S = "+ s);
        }
        else
        {
            System.out.println("Ban da nhap sai dieu kien");
        }
    }
    
}
