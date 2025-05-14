import java.util.Scanner;

public class Divers {
    public static void main(String[] args) {
    
    int a;
    int b; 
    float result ;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez un premier chiffre");
    a = scanner.nextInt();
    System.out.println("Entrez un second chiffre");
    b = scanner.nextInt();

    result = (a+b)/2;

    System.out.println("La moyenne de " +a + " + " + b+ " = " + result);
        
    }    
        
}

