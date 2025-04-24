import java.util.Scanner;

public class EXO14 {
    public static void main(String[] args) { 
boolean A, B, C ;
boolean result ; 

Scanner scanner = new Scanner(System.in);
System.out.println("Donner une valeur à A TRUE or FALSE");
A = scanner.nextBoolean();

System.out.println("Donner une valeur à B TRUE or FALSE");
B = scanner.nextBoolean();


System.out.println("Donner une valeur à C TRUE or FALSE");
C = scanner.nextBoolean();

scanner.close();

result = A || B && !C;

System.out.println("Le résultat est " +result);

}
}
