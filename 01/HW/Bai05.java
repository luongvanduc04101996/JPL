
import java.util.Scanner;

public class Bai5 {
    public static void main(String args[]){
        int n,s=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        if(n>=2)
        {
            for(int i=1;i<=n;i++)
            {
                s+=(2*n+1);
            }
            System.out.println("S = "+ s);
        }
        else
        {
            System.out.println("Ban da nhap sai dieu kien");
        }
    }
}
