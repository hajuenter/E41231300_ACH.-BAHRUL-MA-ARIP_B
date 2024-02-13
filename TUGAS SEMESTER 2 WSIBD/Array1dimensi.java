
package perulangan.dan.array;

/**
 *
 * @author Bahrulapk
 */
public class Array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat array 1 dimensi dengan tipe data String
        String[] bagianNama = {"ACH.", "BAHRUL", "MA'ARIP"};
        // Menggabungkan bagian nama
        String namaLengkap = bagianNama[0] + " " + bagianNama[1] + " " + bagianNama[2];
        // Menampilkan nama lengkap
        System.out.println("Nama Lengkap : " + namaLengkap);
    }
}
