
package person;
/**
 *
 * @author Bahrulapk
 */
public class Personn {
String Nama;
int age; //status
Personn(String Nama, int age){
    this.Nama = Nama;
    this.age = age;
}
public String getName() {
    return Nama;
}
public Integer getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
    public static void main(String[] args) {
        String Nama = "ACH. BAHRUL MA'ARIP";
        String NIM = "E41231300";
        String Status = "AKTIF";
        System.out.println("Nama :" +Nama);
        System.out.println("NIM :" +NIM);
        System.out.println("Status :" +Status);
    }}

    
