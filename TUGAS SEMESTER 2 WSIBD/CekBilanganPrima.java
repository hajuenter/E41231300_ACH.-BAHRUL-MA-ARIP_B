
package cekbilanganprima;
import java.util.Scanner; 
/**
 *
 * @author Bahrulapk
 */
public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner pengguna = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = pengguna.nextInt();
        if (Prima(bilangan, 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " tidak bilangan prima.");
        }
        pengguna.close();
    }    
    public static boolean Prima(int n, int pembagi) {// Fungsi rekursif untuk mengecek bilangan prima atau bukan
        if (n <= 1) {
            return false; }        
        if (pembagi == n) {
            return true; }      
        if (n % pembagi == 0) {
            return false; }       
        return Prima(n, pembagi + 1);
    }
}

                
                
                
              
    
    

