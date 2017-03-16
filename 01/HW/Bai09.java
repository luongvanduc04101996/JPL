
import java.util.Scanner;

public class Bai9 {
    public static void main(String args[]){
        int n,s=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        n = scan.nextInt();
        
        if(n>6)
        {
            for(int i=1;i<=n;i++)
            {
                s*=i;
            }
            System.out.println("S = "+ s);
        }
        else
        {
            System.out.println("Ban da nhap sai dieu kien");
        }
    }
}
