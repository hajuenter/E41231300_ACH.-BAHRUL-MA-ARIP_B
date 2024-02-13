
package perulangan.dan.array;
import java.util.Scanner;
/**
 *
 * @author Bahrulapk
 */
public class perulangankelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Do__While");
        int kelipatan;
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan kelipatan : ");
        kelipatan = input.nextInt();
        System.out.println("Bilangan kelipatan " + kelipatan+ " (1-100): ");
        System.out.println("================================================");
        int i = kelipatan;
    do {
            System.out.print(i + " ");
            i *= kelipatan; //operasi yang mengalikan nilai i dengan inputan dari keyboard user
        } while (i <= 100);
    input.close();
    }
    }
    

