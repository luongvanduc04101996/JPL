
import java.util.Scanner;

public class Bai01 {
  
    public static void NhapMang(int soluong,double[] a){
        Scanner sc = new Scanner(System.in);
        for( int i = 0 ; i < soluong ; i++)
        {
            System.out.println("Nhap phan tu " + (i+1) + ":");
            a[i] = sc.nextDouble();
        }
    }
    
    public static void XuatMang(int soluong,double[] a){
        System.out.println("Cac phan tu cua mang:");
        for( int i = 0 ; i < soluong ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void SoThucAm(int soluong,double[] a){
        System.out.println("\nCac so thuc am:");
        for( int i = 0 ; i < soluong ; i++)
        {
            if( a[i] < 0 )
                System.out.print(a[i] + " ");
        }
    }
    
    public static void DemSoThucDuong(int soluong,double[] a){
        int s = 0;
        for( int i = 0 ; i < soluong ; i++)
        {
            if( a[i] > 0 )
                s++;
        }
        System.out.println("\nCo " + s + "so thuc duong");
    }
    
    public static void Max(int soluong,double[] a){
        double max = a[0];
        for( int i = 1 ; i < soluong ; i++)
        {
            if( a[i] > max )
                max = a[i];
        }
        System.out.println("Max = " + max);
    }
            
    public static void Min(int soluong,double[] a){
        double min = a[0];
        for( int i = 1 ; i < soluong ; i++)
        {
            if( a[i] < min )
                min = a[i];
        }
        System.out.println("Min = " + min);
    }
     
    public static void MaxSoThucAm(int soluong,double[] a){   
        double max = 0;
        int temp = 0;
        for( int i = 0 ; i < soluong ; i++)
        {
            if( a[i] < 0 )
            {
                max = a[i];
                temp = i;
                break;
            }
                
        }
        for( int i = temp+1 ; i < soluong ; i++)
        {
            if( a[i] < 0 && a[i] > max)
                max = a[i];
        }
        System.out.println("Max = " + max);
    }
    
    public static void main ( String arg[])
    {
        int soluong;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong cua mang:");
        soluong = sc.nextInt();
        double[] mangsothuc = new double[soluong];
        NhapMang(soluong, mangsothuc);
        XuatMang(soluong, mangsothuc);
        SoThucAm(soluong, mangsothuc);
        DemSoThucDuong(soluong, mangsothuc);
        Max(soluong, mangsothuc);
        Min(soluong, mangsothuc);
        MaxSoThucAm(soluong, mangsothuc);
    }
}
