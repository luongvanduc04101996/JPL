
import java.util.Scanner;


public class Bai30 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a va b:");
        a = scan.nextInt();
        b = scan.nextInt();
        
        System.out.println("Tong = "+ Tong(a,b) 
                +"\nTich = "+ Tich(a,b)
                +"\nHieu = "+ Tru(a,b)
                +"\nThuong = "+ Chia(a,b)
                +"\nChia lay du = "+ ChiaLayDu(a,b));
               
    }
    
    public static int Tong(int a,int b)
    {
        return a+b;
    }
    
    public static int Tich(int a,int b)
    {
        return a*b;
    }
    
    public static int Tru(int a,int b)
    {
        return a-b;
    }
    
    public static int Chia(int a,int b)
    {
        return a/b;
    }
    
    public static int ChiaLayDu(int a,int b)
    {
        return a%b;
    }
    
}
