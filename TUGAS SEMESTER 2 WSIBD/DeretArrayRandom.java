


package perulangan.dan.array;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Bahrulapk
 */
public class DeretArrayRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random acak = new Random();
      int jumlahDeret;
        System.out.print("Masukkan jumlah deret : ");
        jumlahDeret = input.nextInt();
      int[]deret = new int[jumlahDeret];
        System.out.print("Deret acak : ");
        for(int i = 0; i < jumlahDeret; i++) {
            deret[i] = acak.nextInt(50); 
            {
            System.out.print(deret[i] + " "); 
} input.close();

}        
} 
}
