import java.util.Scanner;

public class EXO14 {
    public static void main(String[] args) { 
boolean A, B, C ; /*Déclaration des variables */
boolean result ; 

Scanner scanner = new Scanner(System.in);
System.out.println("Donner une valeur à A TRUE or FALSE"); /*Demande à l'utilisateur une valeur */
A = scanner.nextBoolean(); /*Met à jour la variable */

System.out.println("Donner une valeur à B TRUE or FALSE");/*Demande à l'utilisateur une valeur */
B = scanner.nextBoolean(); /*Met à jour la variable */

System.out.println("Donner une valeur à C TRUE or FALSE");/*Demande à l'utilisateur une valeur */
C = scanner.nextBoolean(); /*Met à jour la variable */

result = A || B && !C; /*Calcule le résultat */
 
System.out.println("Le résultat est " +result); /* Affiche le résultat */

scanner.close();
}
}
