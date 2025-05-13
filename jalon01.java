import java.util.Scanner;

public class jalon01 {
    public static void main(String[] args) { 
    
    int age; 

    Scanner scanner = new Scanner(System.in);
    System.out.println("Quel age avez-vous?");
    age = scanner.nextInt();

    if ( age >=18) {
        System.out.println ( "Vous êtes majeur");
    }
    else {
        System.out.println ( "Vous êtes mineur");
    }

    scanner.close();

    }
}