import java.util.Scanner;

public class EXO7 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Do you speak english ?"); /*Demande à l'utilisateur si il parle anglais*/
    
    String reponse = scanner.nextLine();

    if (reponse.equalsIgnoreCase ("yes")) {
        System.out.println ("Nice to meet you");
    }
    else if (reponse.equalsIgnoreCase ("no"))
    {
        System.out.println ("Learn English"); 
    }
    else  {
        System.out.println ("Answer yes or no");
    }    
    /*Condition en fonction de si c'est yes or no ou une autre réponse*/
    scanner.close () ; 
}
}
