
/* Taux de change 
   EUROS USD 1,14
   USD EUROS 0,87
   EUROS GPB 0,85
   GPB EUROS 1,16
   USD GPB  0,75
   GPB USD 1,33
 */

 import java.util.Scanner;

 
 public class EXO15bis {
     public static void main(String[] args) {
 
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Quel est votre monnaie ?");
         String monnaieDepart = scanner.nextLine(); 
 
         System.out.println("Quel est votre montant ?");
         double montant = scanner.nextDouble();
 
         scanner.nextLine();  /* Vider le scanner*/
 
         System.out.println("Vous voulez la convertir en quelle devise ?");
         String monnaieArrivee = scanner.nextLine();
 
         if (monnaieDepart.equals(monnaieArrivee)) {
             System.out.println("Erreur : vous ne pouvez pas convertir dans la même devise !");
             scanner.close();
             return;
         }
 
         double taux = 0.0;
 
         /*  Définir les taux de conversion */
         if (monnaieDepart.equals("EUR") && monnaieArrivee.equals("USD")) {
             taux = 1.14;
         } else if (monnaieDepart.equals("EUR") && monnaieArrivee.equals("GBP")) {
             taux = 0.85;
         } else if (monnaieDepart.equals("USD") && monnaieArrivee.equals("EUR")) {
             taux = 0.87;
         } else if (monnaieDepart.equals("USD") && monnaieArrivee.equals("GBP")) {
             taux = 0.75;
         } else if (monnaieDepart.equals("GBP") && monnaieArrivee.equals("EUR")) {
             taux = 1.16;
         } else if (monnaieDepart.equals("GBP") && monnaieArrivee.equals("USD")) {
             taux = 1.33;
         } else {
             System.out.println("Erreur : conversion inconnue !");
             scanner.close();
             return;
         }
 
         /* Calcul du montant converti*/ 
         double montantConverti = montant * taux;
        System.out.println("Résultat : " + montantConverti + " " + monnaieArrivee);
 
         scanner.close();
     }
 }