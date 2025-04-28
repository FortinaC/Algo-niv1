/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 *  * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 */



import java.util.Scanner;

public class EXO15 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Quel est votre monnaie ");
    String monnaieDepart = scanner.nextLine();  
    
    System.out.println("Quel est votre montant ?");
    double montant = scanner.nextDouble();

    scanner.nextLine();
    
    System.out.println ("Vous voulez la convertir en quelle devise");
    String monnaieArrivee = scanner.nextLine();

    if (monnaieDepart.equals(monnaieArrivee))
    { 
    System.out.println ("Vous ne pouvez pas convertir dans la même devise");
    }

    scanner.close ();

double taux = 0.00;

/* Taux de change 
   EUROS USD 1,14
   USD EUROS 0,87
   EUROS GPB 0,85
   GPB EUROS 1,16
   USD GPB  0,75
   GPB USD 1,33
 */

 switch (monnaieDepart) {
    case "EUR":
        switch (monnaieArrivee) {
            case "USD":
                taux = 1.14;
                break;
            case "GBP":
                taux = 0.85;
                break;
            default:
                System.out.println("Erreur : devise d'arrivée inconnue !");
                return;
        }
        break;
}

switch (monnaieDepart) {
    case "USD":
        switch (monnaieArrivee) {
            case "EUR":
                taux = 0.87;
                break;
            case "GBP":
                taux = 0.75;
                break;
            default:
                System.out.println("Erreur : devise d'arrivée inconnue !");
                return;
        }
        break;
}

switch (monnaieDepart) {
    case "GBP":
        switch (monnaieArrivee) {
            case "EUR":
                taux = 1.16;
                break;
            case "USD":
                taux = 1.33;
                break;
            default:
                System.out.println("Erreur : devise d'arrivée inconnue !");
                return;
        }
        break;
}

double montantConverti = montant * taux;
System.out.println("Le montant converti est : " + montantConverti + " " + monnaieArrivee);

}
}



