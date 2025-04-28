import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args) {
          
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez un chiffre"); /*Demandez à l'utilisateur un chiffre*/
   
    int a = scanner.nextInt(); /*Déclaration des variables*/
            
    if (a %2 == 0) {
    System.out.println ("a est bien divisible par 2");        
    }
    else {
    System.out.println ("a n'est pas divisible par 2");    
    } /*Vérification si le chiffre est divisible par 2 et affichage du résultat*/

    scanner.close () ; 
} 
}

