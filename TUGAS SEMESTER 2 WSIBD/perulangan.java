
package perulangan.dan.array;
import java.util.Scanner;
/**
 *
 * @author Bahrulapk
 */
public class perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int awal, akhir;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        awal = input.nextInt();
        System.out.print("Masukkan batas akhir : ");
        akhir = input.nextInt();
        
        System.out.println("Bilangan genap dari " + awal + " sampai ke " + akhir +" : ");
        
        for (int i = awal; i <= akhir; i++) {
             if (i % 2 == 0) { //jika bilangan di bagi 2 dan sisanya nol maka i akan di cetak
                System.out.println(i);
        }
             }
        input.close();
    }
}
