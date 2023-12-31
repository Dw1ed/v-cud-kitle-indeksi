
package Giris;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        int kg;
        double m;
        double endeks;
        Scanner girdi=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz");
        kg=girdi.nextInt();
        System.out.print("Boyunuzu giriniz");
        m=girdi.nextInt();

        endeks=(m*m/kg);
        System.out.print("Vücut endeksiniz"+endeks);


    }
}
