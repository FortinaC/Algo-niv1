import java.util.Scanner;

public class EXO13 {
    public static void main(String[] args) {
        float centimetre; /*Déclaration des variables */
        float metre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner une taille en centimètres :");/*Demande une taille à l'utilisateur en cm */
        centimetre = scanner.nextFloat(); /*met à jour la variable */

        metre = centimetre / 100; /*converti en m */

        System.out.println("Voici la taille en mètres : " + metre + " m "); /*affiche le résultat */

        scanner.close();
    }
}
