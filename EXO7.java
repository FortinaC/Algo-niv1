import java.util.Scanner;

public class EXO7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Do you speak english ?"); /*Demande à l'utilisateur si il parle anglais*/
    
    String response = scanner.nextLine();

    if (response.equals("yes")) {
        System.out.println ("Nice to meet you");
    }
    else if (response.equals ("no"))
    {
        System.out.println ("Learn English"); 
    }
    else  {
        System.out.println ("Answer yes or no");
    }    
    
    scanner.close () ; 
}
}
