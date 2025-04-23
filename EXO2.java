import java.util.Scanner;

public class EXO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entrez un premier chiffre");
        int a = scanner.nextInt();
        
        System.out.println ("Entrez un second chiffre");
        int b = scanner.nextInt();

        int resultat = a - b; 

        System.out.println ("Le résultat de la soustraction est " + resultat ); 

        if (resultat <0) {
            System.out.println("Le résultat est inférieur à 0");
        }
        else 
        {
            System.out.println("Le résultat est supérieur à 0");
        }
        scanner.close () ; 
    } 

    
}
