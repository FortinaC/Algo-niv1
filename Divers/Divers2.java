/*Lire 2 nombres entier A et B puis les afficher dans l’ordre croissant.*/

import java.util.Scanner;

public class Divers2 {
    public static void main(String[] args) {
    
    int a;
    int b; 
    float result ;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez un premier chiffre");
    a = scanner.nextInt();
    System.out.println("Entrez un second chiffre");
    b = scanner.nextInt();

    if (a<b) {
        System.out.println("Dans l'ordre croisant " + a+ " puis " + b);
        
    }
    else {
        System.out.println("Dans l'ordre croisant " + b+ " puis " + a);
        
    }
        
    }    
        
}

