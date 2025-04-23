import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args) {
          
    Scanner scanner = new Scanner (System.in);
    System.out.println("Entrez un chiffre");
    int a = scanner.nextInt();
            
    if (a %2 == 0) {
    System.out.println ("a est bien divisible par 2");        
    }
    else {
    System.out.println ("a n'est pas divisible par 2");    
    }

    scanner.close () ; 
} 
}

