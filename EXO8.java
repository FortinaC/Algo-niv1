import java.util.Scanner;

public class EXO8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*Début du formulaire*/
    System.out.println ("Votre prénom");
    String prenom = scanner.nextLine();

    System.out.println ("Votre nom");
    String nom = scanner.nextLine();

    System.out.println ("Votre adresse e-mail");
    String adresse = scanner.nextLine();

    System.out.println ("Votre mot de passe");
    String motdepasse = scanner.nextLine();

    System.out.println ("Confirmation de votre mot de passe");
    String ConfirmationMotdepasse = scanner.nextLine();
    /*Fin du formulaire*/

    if (!motdepasse.equals(ConfirmationMotdepasse)){
        System.out.println ("Inscription annulée");
        }
    else {System.out.println ("Merci " + prenom + " "+ nom +  ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + adresse ); }
    /*Confirmation des mots de passe*/

    /*Connexion*/
    System.out.println ("Pour vous connecter, entrez votre e-mail");
    String adresseConnexion = scanner.nextLine();

    System.out.println ("Entrez votre mot de passe");
    String motdepasseConnexion = scanner.nextLine();
    /*Fin connexion*/

    if (adresse.equals(adresseConnexion) && motdepasse.equals(motdepasseConnexion))
    {System.out.println ("Connexion réussie");
    } 
    else {
    System.out.println ("Connexion échouée");
    }
     /*Confirmation de l'adresse et du mot de passe pour valider la connexion*/
}
}