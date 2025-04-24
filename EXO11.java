import java.util.Scanner;

public class EXO11 {
    public static void main(String[] args) {
    int solde = 3000;
    int retrait;

    Scanner scanner = new Scanner(System.in);
     System.out.println("Combien voulez vous retirer ?");
     retrait = scanner.nextInt();

     scanner.close () ;
    
    if (Retrait <=3000) {System.out.println ("Votre nouveau solde est de" + (Solde-Retrait));
    }
    else 
    {
        System.out.println ("Solde insuffisant");
    }

    }
}

