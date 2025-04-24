import java.util.Scanner;

public class EXO12 {
    public static void main(String[] args) {
        float prix;
        int pourcentage;
        float result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Votre prix :");
        prix = scanner.nextFloat();

        System.out.println("Votre réduction :");
        pourcentage = scanner.nextInt();

        result = prix - ((prix * pourcentage) / 100);

        System.out.println("Prix après réduction de " + pourcentage + "% : " + result);

        scanner.close();
    }
}