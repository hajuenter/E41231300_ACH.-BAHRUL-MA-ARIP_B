
package percabangan.pkgif;
import java.util.Scanner;
/**
 *
 * @author Bahrulapk
 */
public class PercabanganIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kharisma Agung Plaza < KAP >");
        System.out.println("Promo Belanja Berhadiah");
        System.out.println("Khusus Pembelian 5 barang pertama");
        System.out.println("Dengan harga minimum Rp 10000,00");
        System.out.println("----------------------------------------------------");
    String pembeli;
    int barang1, barang2, barang3, barang4, barang5;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama pembeli : ");
    pembeli = input.next();
        System.out.print("Masukkan harga barang ke-1 : ");
        barang1 = input.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        barang2 = input.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        barang3 = input.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        barang4 = input.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        barang5 = input.nextInt();
    int totalHarga = barang1 + barang2 + barang3 + barang4 + barang5;
        System.out.println("Total harga pembelian atas nama " + pembeli + " adalah Rp " + totalHarga);    
    if (barang1 >= 10000) {
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
    } else if (barang2 >= 10000) {
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
    } else if (barang3 >= 10000) {
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
    } else if (barang4 >= 10000) {
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
    } else if (barang5 >= 10000) {
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
    } else {
        System.out.println("Maaf anda tidak mendapatkan hadiah");
    }
    
        System.out.println("----------------------------------------------------");
        System.out.println("Terima kasih");
        System.out.println("Anda sudah berbelanja di Kharisma Agung Plaza");
}
}
