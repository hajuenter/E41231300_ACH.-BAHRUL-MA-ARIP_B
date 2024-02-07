
package person;

/**
 *
 * @author Bahrulapk
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        siswa javabook = new siswa();
        javabook.set("E41231300", "ACH. BAHRUL MA'ARIP", "ACTIVE");
        javabook.show();
}}
class siswa {
    String nim;
    String nama;
    String status;
public void set(String nim, String nama, String status) {
    this.nama = nama;
    this.nim = nim;
    this.status = status;
}
public void show() {
System.out.println("Informasi siswa");
System.out.println("nama :" +nim);
System.out.println("nim :" +nama);
System.out.println("status :" +status);
}}