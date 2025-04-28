import java.util.Scanner;

public class EXO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entrez deux chiffres"); /*Demandez à l'utilisateur des chiffres*/
        
        int a = scanner.nextInt(); /*Déclaration des variables*/
        int b = scanner.nextInt();
        int resultat = a - b; 

        System.out.println ("Le résultat de la soustraction est " + resultat ); /*Déclaration du résultat*/ 

        if (resultat < 0) {
            System.out.println("Le résultat est inférieur à 0");  
        }
        else 
        {
            System.out.println("Le résultat est supérieur à 0"); 
    
        } /*Vérification si le résultat est inférieur ou non à 0 et affichage du résultat*/
    
        scanner.close () ;
    } 

    
}
