
package percabangan.pkgif;
import java.util.Scanner;
/**
 *
 * @author Bahrulapk
 */
public class PercabanganSwitchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser;
        System.out.println("CAFE CERIA");
        System.out.println("ANEKA MINUMAN");
        System.out.println("-----------------------------------------------");
        System.out.println("SPECIAL MENU : ");
        System.out.println("1. Soft drinks");
        System.out.println("2. Mix juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea");
        inputUser = new Scanner(System.in);
        String pembeli, pilihan;
        System.out.print("Masukkan nama pembeli : ");
        pembeli = inputUser.nextLine();
        System.out.print("Silahkan masukan pilihan anda : ");
        pilihan = inputUser.nextLine();
        switch(pilihan) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case "2": 
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case "3": 
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default :
                System.out.println("nomor yang anda masukkan tidak ada di list menu");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + pembeli + " telah berkunjung di Cafe Ceria");        
    }
    }
