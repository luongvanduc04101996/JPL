
import java.util.Scanner;


public class Bai23 {
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a va b:");
        a = scan.nextInt();
        b = scan.nextInt();
        
        if(a==0)
        {
            if(b==0)
                System.out.println("Pt co vo so nghiem");
            else
                System.out.println("Pt vo nghiem");
        }
        else
            System.out.println("Pt co nghiem X = "+(float)-b/a);
    }
    
}
