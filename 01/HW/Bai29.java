
import java.util.Scanner;


public class Bai29 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int namsinh,tuoi;
        String ten;
        
       
        System.out.println("Nhap ten:");
        ten = scan.nextLine();
        System.out.println("Nhap nam sinh");
        namsinh = scan.nextInt();
        
        tuoi = 2017 - namsinh;
        
        System.out.println("Ten\t\tTuoi:\n"+ten+"\t\t"+tuoi);
        
       
    }
}
