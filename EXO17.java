/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class EXO17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int typeCarburant ;
        double consommation =0 ;
        double prixLitre=0 ;
        String carburantNom =" " ;
        

        System.out.println ("Quel carburant choissisez-vous ? 0, gazole, 1, sans plomb 95 et 2 sans plomb 98");
        typeCarburant = scanner.nextInt();

       

        if (typeCarburant == 0) {
            carburantNom = "Gazole";
            consommation = 5.5; /* litres/100km */ 
            prixLitre = 1.69;   /*  prix moyen en euros*/ 
        } else if (typeCarburant == 1) {
            carburantNom = "Sans Plomb 95";
            consommation = 6.5;
            prixLitre = 1.87;
        } else if (typeCarburant == 2) {
            carburantNom = "Sans Plomb 98 (E5)";
            consommation = 6.5;
            prixLitre = 1.96;
        } else {
            System.out.println("Type de carburant non reconnu.");
            scanner.close();
        }

        System.out.println("Vous avez choisi : " + carburantNom);

        System.out.println("Quelle est la distance à parcourir (en km) ?");
        double distance = scanner.nextDouble();

        double litresUtilises = (consommation / 100) * distance; /* calcul litres utilisés */
        double cout = litresUtilises * prixLitre; /* calcul du coût */

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println ("Pour " + distance + " vous allez dépenser en moyenne " + df.format(cout) + "€");


        scanner.close();
    }
}

    
   


