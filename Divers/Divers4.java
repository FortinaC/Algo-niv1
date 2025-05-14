/*Lire 3 nombres décimaux A, B et C puis les afficher dans l’ordre décroissant.*/

import java.util.Scanner;

public class Divers4 {
    public static void main(String[] args) {
    
    double a;
    double b;
    double c;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez un premier chiffre");
    a = scanner.nextDouble();
    System.out.println("Entrez un second chiffre");
    b = scanner.nextDouble();
    System.out.println("Entrez un troisième chiffre");
    c = scanner.nextDouble();
    
    if (a>b && b>c) {
        System.out.println("dans l'odre décroissant " +  a + ", " + b + ", " + c);
        
    }
  
    if (a >= b && a >= c) {
        if (b >= c) {
            System.out.println(a + ", " + b + ", " + c);
        } else {
            System.out.println(a + ", " + c + ", " + b);
        }
    } else if (b >= a && b >= c) {
        if (a >= c) {
            System.out.println(b + ", " + a + ", " + c);
        } else {
            System.out.println(b + ", " + c + ", " + a);
        }
    } else { // c est le plus grand
        if (a >= b) {
            System.out.println(c + ", " + a + ", " + b);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
        
    }    
        
}

