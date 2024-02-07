
package person;

/**
 *
 * @author Bahrulapk
 */
public class managingpeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personn p1 = new Personn("Ariel", 37);
        Personn p2 = new Personn("Joseph",15);
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName()+" is the same age as "+ p2.getName());
        }
        else {
            System.out.println(p1.getName()+" is NOT the same age as "+ p2.getName());
        }
    }
    }
