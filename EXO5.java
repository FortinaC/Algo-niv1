import java.util.Scanner;

public class EXO5 {
    public static void main(String[] args) {
          
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez trois chiffres"); /*Demande à l'utilisateur des chiffres*/
    
    int a = scanner.nextInt(); /*Déclaration des variables*/
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int resultat = (a*b)/c;

    if (resultat>10) {
     System.out.println ("le résultat est supérieur à 10"); 
         
    }
    else {
        System.out.println ("Le résultat est inférieur à 10");
    }

    scanner.close () ; 
} /*Vérification si le résultat est supérieur ou inférieur à 10*/
}
