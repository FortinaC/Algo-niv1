/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/

import java.util.Scanner;

public class EXO20 {
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    int totalVotant= 150000;
    int votantInutile;
    int votantEscreau;
    int totalVotes;
    int votesBlanc;
    double pourcentageInutile;
    double pourcentageEscreau;

    System.out.println("Combien de personnes ont voté Mme Inutile");
    votantInutile = scanner.nextInt();

    System.out.println("Combien de personnes ont voté M Escreau");
    votantEscreau = scanner.nextInt();

    totalVotes = votantInutile + votantEscreau ;

    if (totalVotes > totalVotant ) {
    System.out.println ("Il y a une erreur");
    }
    
    votesBlanc =totalVotant - totalVotes;
    System.out.println("Vous avez " + votesBlanc + " d'abstentions, ils seront comptés nul");
    
    pourcentageInutile = (votantInutile * 100.0) / totalVotes;
    pourcentageEscreau = (votantEscreau * 100.0) / totalVotes;
    
    System.out.println ("Mme Inutile a " + pourcentageInutile + " %");
    System.out.println ("M Escreau a " + pourcentageEscreau + " %");
    
    if (pourcentageInutile > 60) {
        System.out.println ("Mme Inutile est la nouvelle maire");
    }
    else if (pourcentageEscreau > 60) {
        System.out.println ("M Escreau est la nouvelle maire");
    }
    else {
        System.out.println ("Il y aura un deuxième tour");
    } 


}
}
