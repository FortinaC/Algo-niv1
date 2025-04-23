import java.util.Scanner;

public class EXO5 {
    public static void main(String[] args) {
          
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez un chiffre");
    int a = scanner.nextInt();

    System.out.println("Entrez un chiffre");
    int b = scanner.nextInt();

    System.out.println("Entrez un chiffre");
    int c = scanner.nextInt();

    int resultat = (a*b)/c;

    if (resultat>10) {
     System.out.println ("le résultat est supérieur à 10"); 
         
    }
    else {
        System.out.println ("Le résultat est inférieur à 10");
    }
}
}
