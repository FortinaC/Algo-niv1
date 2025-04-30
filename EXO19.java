/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/
import java.util.Scanner;

public class EXO19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le nombre de secondes ?");
        int totalsecondes = scanner.nextInt();

        int heure = totalsecondes/ 3600; /*Calcul du nombre d'heure*/
        int resteSeconde = totalsecondes % 3600; /*Calcul du reste de seconde*/

        int minute = resteSeconde / 60; /*Récupération du reste de seconde et calcul des minutes*/
        int seconde = resteSeconde % 60; /*Calcul du reste de seconde*/

        System.out.println(totalsecondes + " secondes correspondent à " + heure + " heures, " + minute + " minutes et " + seconde + " seconde(s)");

        scanner.close();
    }
}
