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

import java.util.Scanner;

public class EXO16 {

    public static void main(String[] args) {
        /* Déclaration des variables*/
        double prix = 1500; /* Prix initial*/
        int place = 65;     /*Nombre de places disponibles*/
        int age;
        String classe;
        double tauxReductionPlace = 0.0;
        double tauxAugmentationPlace = 0.0;
        double tauxReductionAge = 0.0;
        double tauxAugmentationClasse = 0.0;
        double prixFinal;

        Scanner scanner = new Scanner(System.in);

        /* Demander l'âge*/
        System.out.println("Quel est votre âge ?");
        age = scanner.nextInt();
        scanner.nextLine(); 

        /* Demander la classe*/
        System.out.println("Souhaitez-vous être en classe business ? (OUI/NON)");
        classe = scanner.nextLine();

        /* Appliquer les réductions selon l'âge*/
        if (age < 18) {
            tauxReductionAge += 0.20;
        }

        if (age > 60) {
            tauxReductionAge += 0.40;
        }

        /* Réductions ou augmentations selon les places restantes*/
        if (place > 60) {
            tauxReductionPlace += 0.20;
        } else if (place < 20) {
            tauxAugmentationPlace += 0.20;
        }

        /* Augmentation si classe business*/
        if (classe.equalsIgnoreCase("OUI")) {
            tauxAugmentationClasse += 0.20;
        }

        /* Calcul final*/
        prixFinal = prix * (1 - tauxReductionAge) *(1 - tauxReductionPlace)* (1 + tauxAugmentationPlace)* (1 + tauxAugmentationClasse);

        /*  Affichage du prix final*/
        System.out.printf("Le prix final de la place est, " + prixFinal );

        scanner.close();
    }
}
