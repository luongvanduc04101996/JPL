
import java.util.Scanner;

public class Bai02 {
    public static void NhapMang(int soluong,int[] a){
        Scanner sc = new Scanner(System.in);
        for( int i = 0 ; i < soluong ; i++)
        {
            System.out.println("Nhap phan tu " + (i+1) + ":");
            a[i] = sc.nextInt();
        }
    }
    
    public static void XuatMang(int soluong,int[] a){
        System.out.println("Cac phan tu cua mang:");
        for( int i = 0 ; i < soluong ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void Tong(int soluong,int[] a){
		int s=0;
		for(int i = 0 ; i < soluong ; i++)
		{
			s+=a[i];
		}
		System.out.println("\n-Tong: S = "+s);
	}
	
	public static void DemSoLuongLe(int soluong,int[] a){
		int dem=0;
		for(int i = 0 ; i < soluong ; i++)
		{
			if(a[i]%2!=0) dem++;
		}
		System.out.println("\nSo luong cac so le trong mang: "+dem);
	}
	
	public static void KiemTraAm(int soluong,int[] a){
		int dem=0;
		for(int i = 0 ; i < soluong ; i++)
		{
			if(a[i]<0) 
                        {
                            dem++;
                            break;
                        }
		}
		if(dem==0)
                    System.out.println("Khong co phan tu am");
		else
                    System.out.println("Co phan tu am");
	}
	
	public static void KiemTraToanChan(int soluong,int[] a){
		int dem=0;
		for(int i = 0 ; i < soluong ; i++)
		{
			if(a[i]%2!=0) 
                        {
                            dem++;
                            break;
                        }
		}
		if(dem==0) 
                    System.out.println("Mang toan chan");
		else
                    System.out.println("Mang co so le");
	}
	
	public static void SapXepTangDan(int soluong,int[] a){	
                int chot,temp;
		for(int i = 0 ; i < soluong -1; i++)
		{
                    chot = i;
                    for( int j = i+1 ; j < soluong ; j++)
                    {
                        if(a[j] < a[chot])
                        {
                            chot = j;
                        }
                    }
                    
                    temp = a[chot];                   
                    a[chot] = a[i];
                    a[i] = temp;
                    
                }
		System.out.println("Mang tang dan:");
		for(int i = 0 ; i < soluong ; i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
	
	public static void ChanTangLeGiam(int soluong,int[] a){
            
            int[] b = new int[a.length];
            int[] c = new int[a.length];
            int dem1 = 0, dem2 = 0,chot,temp;
            System.out.print("\nChan tang dan:");
            
            for(int i = 0 ; i < soluong ; i++)
		{
                    if(a[i]%2==0)
                    {
			b[dem1] = a[i];
                        dem1++;
                    }
                    else
                    {
                        c[dem2] = a[i];
                        dem2++;
                    }
                }
          for(int i = 0 ; i < dem1 -1; i++)
            {
                    chot = i;
                    for( int j = i+1 ; j < dem1 ; j++)
                    {
                        if(b[j] < b[chot])
                        {
                            chot = j;
                        }
                    }
                    
                    temp = b[chot];                   
                    b[chot] = b[i];
                    b[i] = temp;
            }
          for(int i = 0 ; i < dem1 ; i++)
		{
			System.out.print(b[i]+" ");
			
		}
		
            System.out.print("\nLe giam dan:");
		for(int i = 0 ; i < dem2 -1; i++)
		{
                    chot = i;
                    for( int j = i+1 ; j < dem2 ; j++)
                    {
                        if(c[j] < c[chot])
                        {
                            chot = j;
                        }
                    }
                    
                    temp = c[chot];                   
                    c[chot] = a[i];
                    c[i] = temp;
                }
                for(int i = 0 ; i < dem2 ; i++)
                {
                    System.out.print(c[i] + " ");
                }
		
	}
	
	public static int SoNguyenTo(int n){
		for(int i = 2; i <= n/2 ; i++)
		{
			if(n%i==0) return 0;
		}
		return 1;
	}
	
	public static void MangCoSoNguyenToKo(int soluong,int[] a){
		int dem=0;
		for(int i = 0 ; i < soluong ; i++)
		{
			if(SoNguyenTo(a[i])==1) dem++;
		}
		if(dem==0) 
                    System.out.println("\nMang khong co so nguyen to");
		else
                    System.out.println("\nMang co so nguyen to");
	}
	
	public static void DemSoNguyenTo(int soluong,int[] a){
		int dem=0;
		for(int i = 0 ; i < soluong ; i++)
		{
			if(SoNguyenTo(a[i])==1) dem++;
		}
		if(dem==0)
                    System.out.println("Mang khong co so nguyen to");
		else
                    System.out.println("Co "+ dem + "so nguyen to");
	}
    
    public static void main ( String arg[])
    {
        int soluong;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong cua mang:");
        soluong = sc.nextInt();
        int[] mangsonguyen = new int[soluong];
        NhapMang(soluong, mangsonguyen);
        XuatMang(soluong, mangsonguyen);
        Tong(soluong, mangsonguyen);
        ChanTangLeGiam(soluong, mangsonguyen);
        DemSoLuongLe(soluong, mangsonguyen);
        DemSoNguyenTo(soluong, mangsonguyen);
        KiemTraAm(soluong, mangsonguyen);
        KiemTraToanChan(soluong, mangsonguyen);
        MangCoSoNguyenToKo(soluong, mangsonguyen);
        SapXepTangDan(soluong, mangsonguyen);
    }
    
    
}
