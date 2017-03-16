
import java.util.Scanner;


public class Bai24 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhap a va b:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        PtBacHai(a, b, c);
    }
    
    public static void PtBacHai(double c, double a, double b)
    {
        if(c==0)
        {
            if(a==0)
        {
            if(b==0)
                System.out.println("Pt co vo so nghiem");
            else
                System.out.println("Pt vo nghiem");
        }
        else
            System.out.println("Pt co nghiem X = "+(double)-b/a);
        }
        else
        {
            double delta;
            delta = a*a - 4*b*c;
            if(delta>0)
            {
                double x1,x2;
                x1 = (-a+Math.sqrt(delta))/2*c;
                x2 = (-a-Math.sqrt(delta))/2*c;
                System.out.println("Pt co 2 nghiem:\nX1 = "+x1+"\nX2 = "+x2);
            }
            else if(delta == 0)
            {
                double x;
                x = -a/(2*c);
                System.out.println("Pt co nghiem kep X1 = X2 = "+ x);
            }
            else
                System.out.println("Pt vo nghiem");
        }
    }
}
