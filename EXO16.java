   /* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/

import java.util.Scanner;

public class EXO16 {
public static void main(String[] args) {

    double prix = 1500; /*Déclare les variables*/
    int place = 18;
    int age ;
    String classe ;
    double prixFinal ; 
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println ("Quel est votre age");/*Demande à l'utilisateur l'age */
    age = scanner.nextInt(); /*Stocke la variable age */

    classe = scanner.nextLine();
    
    System.out.println ("Souhaitez-vous être en classe buisness OUI/NON"); /*Demande à l'utilisateur si buisness classe*/
    classe = scanner.nextLine (); /*Stocke la variable classe */

    prixFinal = prix; /*Stocke la variable age */

    if (age < 18) { prixFinal = prixFinal - (prixFinal * 0.20); /*Réduction si mineur */
        
    }
    else if (age >= 60) {
        prixFinal = prixFinal - (prixFinal*0.40); /*Réduction si senior*/
    }

    
    if (place >= 60) {
        prixFinal= prixFinal - (prixFinal*0.20); /*Réduction si plus de 60 places restantes */

    }
    else if (place <= 20) {
        prixFinal = prixFinal + (prixFinal*0.20); /*Augmentation si il reste 20 places */
    }
    

    if (classe.equals("OUI")) {
        prixFinal = prixFinal + (prixFinal*0.20); /*Augmentation si buisness classe */
    }
    
    System.out.println("Le prix final est " +prixFinal); /* Affichage du prix final */

    scanner.close () ;
}
}
