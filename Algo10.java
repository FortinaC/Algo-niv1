import java.util.Scanner;

public class Algo10 {
    public static void main(String[] args) { 
   Scanner scanner = new Scanner(System.in); //Création d'un objet scanner 
    System.out.println ("Entrez un premier chiffre"); 
    int a = scanner.nextInt();

    System.out.println ("Entrez un second chiffre"); 
    int b = scanner.nextInt();

    int somme = a + b ;    
    System.out.println("La somme de "+ a + " + " + b + " = " + somme);

    if (somme >10) {
    System.out.println ("Le résultat est supérieur à 10");
    }
    else {
        System.out.println ("Le résultat est inférieur à 10");
        }
    scanner.close () ; 
}     
        
}

