import java.util.Scanner;

public class EXO13 {
    public static void main(String[] args) {
        float centimetre;
        float metre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner une taille en centimètres :");
        centimetre = scanner.nextFloat();

        metre = centimetre / 100;

        System.out.println("Voici la taille en mètres : " + metre + " m ");

        scanner.close();
    }
}
