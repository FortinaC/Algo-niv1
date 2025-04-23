import java.util.Scanner;

public class EXO6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Quel est votre nom ?");
    String nom = scanner.nextLine();
    
    System.out.println ("Quel est votre age ?");
    int age = scanner.nextInt();

    System.out.println ("Je m'appelle " + nom + " et j'ai " + age + " ans ");

}
}
