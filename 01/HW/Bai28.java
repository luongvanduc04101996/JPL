
import java.util.Scanner;


public class Bai28 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double toan,ly,hoa,diemtb;
        String maHS,tenHS;
        
        System.out.println("Nhap diem toan:");
        toan = scan.nextDouble();
        System.out.println("Nhap diem ly:");
        ly = scan.nextDouble();
        System.out.println("Nhap diem hoa:");
        hoa = scan.nextDouble();
        System.out.println("Nhap ma HS:");
   
        scan.nextLine();
        maHS = scan.nextLine();
        System.out.println("Nhap ten HS:");
        tenHS = scan.nextLine();
        
        diemtb = (toan + ly + hoa)/3;
        System.out.println("MaSV\tTenSV\tToan\tLy\tHoa\tTB\n"+maHS+"\t"+tenHS+"\t"+toan+"\t"+ly+"\t"+hoa+"\t"+diemtb);
        
        if(diemtb>=8)
            System.out.println("La HS gioi!");
        else if(diemtb>=6.5)
            System.out.println("La HS kha!");
        else if(diemtb>=5)
            System.out.println("La HS TB!");
        else
            System.out.println("La HS kem!");
    }
}
