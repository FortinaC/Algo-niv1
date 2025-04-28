public class PETITDEJ {
    public static void main(String[] args) {
        int briqueLait = 50;
        int cereales = 20 ;
        int bol = 20;

    if (briqueLait==0 && cereales==0 && bol==0) {
        System.out.println ("Je ne peux pas prendre mon petit dej");
     }

     else {
        System.out.println ("Je peux prendre mon petit dej");
     }

     bol =+ cereales;
     bol =+ briqueLait;

     System.out.println ("J'ajoute le lait et les céréales dans le bol");
     System.out.println ("Je peux manger mon petit dej");


    }


}