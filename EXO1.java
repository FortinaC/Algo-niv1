import java.util.Scanner;

public class EXO1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); /*Création d'un objet scanner*/
    System.out.println ("Entrez un premier chiffre"); /*Demande à l'utilisateur un chiffre*/
    int a = scanner.nextInt(); /*stocke la variable de l'utilisateur*/

    System.out.println ("Entrez un second chiffre"); /*Demande à l'utilisateur un chiffre*/
    int b = scanner.nextInt(); /*stocke la variable de l'utilisateur*/

    int somme = a + b ; /*créer une variable pour stocker la somme*/

    System.out.println("La somme de "+ a + " + " + b + " = " + somme); /*affiche le résultat*/

    scanner.close () ; 
}
}