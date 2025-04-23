import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Quel est votre nom ?"); /*Demande à l'utilisateur des informations*/
    System.out.println ("Quel est votre age ?");
    
    
    String nom = scanner.nextLine(); /*Déclaration des variables*/
    int age = scanner.nextInt();
    
    System.out.println ("Je m'appelle " + nom + " et j'ai " + age + " ans "); /*Affichage automatique de la petite phrase*/ 

}
}
