/*Lire un nombre A correspondant à un âge (en années).
Selon l’âge fourni, le programme doit afficher l’un des messages suivants :
Vous êtes à la retraite depuis X années
Il vous reste X années avant la retraite.
C’est le moment de prendre sa retraite.
La valeur fournie n’est pas un âge valide.
Pour cet exercice, la retraite est fixée à 62 ans.*/

import java.util.Scanner;

public class Divers3 {
    public static void main(String[] args) {
    
    int age;
    int result ;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez votre age ?");
    age = scanner.nextInt();

    result = 62 - age;
    
    if (age>62) {
        System.out.println("vous êtes à la retraite depuis " + - result);
        
    }
    else if (age<62) {
        System.out.println("Il vous reste " + result + " ans avant de prendre sa retraite");
        
    } 
    
    else if (age==62) {
        System.out.println("C'est le moment de prendre sa retraite");
        
    } 
    
    else {
        System.out.println ("La valeur fournie n'est pas valide");
        
    } 
        
    }    
        
}

