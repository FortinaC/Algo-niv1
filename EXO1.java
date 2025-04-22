import java.util.Scanner;

public class EXO1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Entrez un premier nombre");
    int a = scanner.nextInt();

    System.out.println ("Entrez un second nombre");10 
    int b = scanner.nextInt();

    int somme = a + b ;    
    System.out.println("La somme de "+ a + " + " + b + "=" + somme);

    scanner.close () ; 
}
}