import java.util.Scanner;

public class EXO11 {
    public static void main(String[] args) {
    int solde = 3000; /*Déclaration des variables*/
    int retrait;

    Scanner scanner = new Scanner(System.in);
     System.out.println("Combien voulez vous retirer ?"); /*Demandez à utilisateur la somme à retirer*/
     retrait = scanner.nextInt();

     scanner.close () ;
    
    if (retrait <=3000) {System.out.println ("Votre nouveau solde est de " + (solde-retrait));
    }
    else 
    {
        System.out.println ("Solde insuffisant");
    }
    /*Autorise ou non le retrait*/
    }
}

