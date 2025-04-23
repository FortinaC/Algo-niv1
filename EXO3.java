import java.util.Scanner;

public class EXO3 {
    public static void main(String[] args) {
          
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez un deux chiffres"); /*Demandez à l'utilisateur des chiffres*/ 
    
    int a = scanner.nextInt(); /*Déclaration des variables*/
    int b = scanner.nextInt();

    int resultat = a+b; 
    
    System.out.println ("Le résultat est "+ resultat); /*Affichage du résultat*/

    if (resultat %2 == 0) {
    System.out.println ("Le résultat est pair");        
    }
    else {
    System.out.println ("Le résultat est impair");    
    } /*Vérification si le résultat est pair ou impair*/

    scanner.close () ; 
} 
}
