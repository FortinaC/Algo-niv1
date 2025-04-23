import java.util.Scanner;

public class EXO3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println ("Entrez un premier chiffre");
    int a = scanner.nextin(); 

    System.out.println ("Entrez un second chiffre");
    int b = scanner.nextin(); 

    int resultat = a + b;     
} 
}
