import java.util.Scanner;

public class EXO12 {
    public static void main(String[] args) {
        float prix; /*Déclaration des variables*/
        int pourcentage;
        float result;

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Votre prix :"); /*Demande le prix à l'utilisateur*/
        prix = scanner.nextFloat(); /*Met à jour la variable*/

        System.out.println("Votre réduction :");/*Demande la réduction à l'utilisateur*/
        pourcentage = scanner.nextInt(); /*Met à jour la variable*/

        prix = Math.round(prix*100)/100;
       
        result = prix - ((prix * pourcentage) / 100); /*Calcul le résultat */

        System.out.println("Prix après réduction de " + pourcentage + "% : " + result + "€"); /*Affiche le résultat */

        scanner.close();
    }
}