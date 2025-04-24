import java.util.Scanner;

public class EXO1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); /*Création d'un objet scanner*/
    System.out.println ("Entrez deux chiffres"); /*Demande à l'utilisateur deux chiffres*/
    
    int a = scanner.nextInt(); /*stocke la variable de l'utilisateur*/
    int b = scanner.nextInt(); 

    int somme = a + b ; /*créer une variable pour stocker la somme*/

    System.out.println("La somme de "+ a + " + " + b + " = " + somme); /*affiche le résultat*/

    scanner.close () ; 
}
}