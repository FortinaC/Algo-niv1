
/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
    * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'abord ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/
import java.util.Scanner;

public class EXO18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double montantPret;
        boolean enCDI;
        double salaire = 0.0;
        double apport;
        double propriete = 0.0;
        boolean condition1;
        boolean condition2;
        boolean condition3;

        System.out.println ("Quel est votre montant de pret ?");  /*Demande du montant du prêt*/ 
        montantPret= scanner.nextDouble ();

        System.out.println ("Etes-vous en CDI (TRUE/FALSE)"); /*Demande si vous êtes en CDI*/
        enCDI = scanner.nextBoolean();

        if (enCDI) {
            System.out.println ("Quel est votre salaire ?"); /*Si CDI quel est votre salaire*/
            salaire = scanner.nextDouble();
        }

        System.out.println ("Quel est votre apport ?"); /*Demande de la deuxieme condition l'apport*/
        apport = scanner.nextDouble();

        if (!enCDI) { /*Si pas en CDI demande une valeur d'une propriété*/
            System.out.println ("Quel est la valeur de votre propriété");
            propriete = scanner.nextDouble();
        }
       condition1 = enCDI && salaire >= 3000; /*Présentation des conditions*/
       condition2 = apport >= montantPret*0.25;
       condition3 = !condition1 && propriete >= montantPret*0.75;

       if (condition1 && condition2 || condition3) { /*Vérification des conditions pour obtenir le prêt*/
        System.out.println ("Vous avez obtenu votre prêt");
        }
        else {
        System.out.println ("Hélas, vous ne pouvez pas obtenir de prêt");
        }

        scanner.close();
    }
}