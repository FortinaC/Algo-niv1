import java.util.Scanner;

public class EXO10 {
     public static void main(String[] args) {
    
    int score=0;

    Scanner scanner = new Scanner(System.in);
    /*Question 1*/
    System.out.println("Question 1: PC veut dire Personnal Computer ? (VRAI/FAUX)");
    String reponse1=scanner.nextLine();
    if (reponse1.equals("VRAI"));
    {score++;}
    
    /*Question 2*/
    System.out.println("Question 2: Le premier virus a été créé dans les années 60 ? (VRAI/FAUX)");
    String reponse2=scanner.nextLine();
    if (reponse2.equals("FAUX"));
    {score++;}
        
    /*Question 3*/
    System.out.println("Question 3: JAVA est plus vieux que langage PYTHON ? (VRAI/FAUX)");
    String reponse3=scanner.nextLine();
    if (reponse3.equals("FAUX"));
    {score++;}

    /*Question 4*/
    System.out.println("Question 4: HTML est le langage le plus utilisé pour écrire des pages web (VRAI/FAUX)");
    String reponse4=scanner.nextLine();
    if (reponse4.equals("VRAI"));
    {score++;}

    /*Question 5*/
    System.out.println("Question 5: Facebook est plus vieux que wikipedia (VRAI/FAUX)");
    String reponse5=scanner.nextLine();
    if (reponse5.equals("FAUX"));
    {score++;}

    /*Total du score*/
    System.out.println ("Votre score est de " +score);
   
    scanner.close () ;

    if (score==5) {
        System.out.println ("Tu es le meilleur");
    }
    else {
        System.out.println ("Tu peux t'améliorer encore");
    }
     /*Message personnalisé en fonction du score*/
 


}
}
