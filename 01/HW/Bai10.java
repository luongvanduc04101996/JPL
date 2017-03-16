
import java.util.Scanner;

public class Bai10 {
    public static void main(String args[]){
        double x,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap X va N:");
        x = scan.nextDouble();
        n = scan.nextDouble();
        
        x = Math.pow(x,n);
        
        System.out.println("X^N = "+x);
    }
}
