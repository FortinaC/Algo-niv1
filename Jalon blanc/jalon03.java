import java.util.Scanner;

public class jalon03 {
    public static void main(String[] args) { 
    
    double prixHT;
    double prixTTC;
    double TVA; 
    

    Scanner scanner = new Scanner(System.in);
    System.out.println("Quel est le prix hors taxe?");
    prixHT = scanner.nextDouble();
    
    System.out.println("Quel est votre taux de TVA?");
    TVA = scanner.nextDouble();

    prixTTC = prixHT + (prixHT * TVA)/100;

    
    System.out.println ("Le prix TTC égal à " + prixTTC);
        
    
    scanner.close();

    }
}