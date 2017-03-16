
import java.util.Scanner;

public class Bai8 {
    public static void main(String args[]){
        int n;
        double s=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        if(n>5)
        {
            for(int i=0;i<=n;i++)
            {
                s+=(double)(2*n+1)/(2*n+2);
            }
            System.out.println("S = "+ s);
        }
        else
        {
            System.out.println("Ban da nhap sai dieu kien");
        }
    }
}
