import java.util.Scanner;

public class jalon02 {
    public static void main(String[] args) { 
    
    double compteA;
    double compteB; 
    double compteAfin;
    double compteBfin;
    double montant;


    Scanner scanner = new Scanner(System.in);
    System.out.println("Combien avez vous sur votre compte A ?");
    compteA = scanner.nextDouble();
    System.out.println("Combien avez vous sur votre compte B ?");
    compteB = scanner.nextDouble();

    System.out.println("Combien voulez vous transférer ?");
    montant = scanner.nextDouble();

    compteAfin = compteA - montant;
    compteBfin = compteB + montant;

    System.out.println ("Compte A donne " + montant + " à son compte B");

    if (montant > 0 && montant <= compteA) {
        System.out.println ("Compte A a maintenant " + compteAfin);
        System.out.println ("Compte B a maintenant " + compteBfin);
    }
    else {
        System.out.println ("Opération impossible");
    }

    scanner.close();

    }
}