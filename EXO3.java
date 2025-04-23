import java.util.Scanner;

public class EXO3 {
    public static void main(String[] args) {
          
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez un premier chiffre");
    int a = scanner.nextInt();
    
    System.out.println ("Entrez un second chiffre");
    int b = scanner.nextInt();

    int resultat = a+b; 
    
    System.out.println ("Le résultat est "+ resultat);

    if (resultat %2 == 0) {
    System.out.println ("Le résultat est pair");        
    }
    else {
    System.out.println ("Le résultat est impair");    
    }

    scanner.close () ; 
} 
}
