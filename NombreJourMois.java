import java.util.Scanner;

public class NombreJourMois{
    public static void main(String[] args) {
        // procédure permettant de demander à l'uilisateur de saisir une année et un mois à partir du clavier 

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une année");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer un mois");
        int b = sc1.nextInt();
        // test sur mois pour connaître le nombre de jour 
        switch(b){
            case 1:
                // affichage du nombre de jour
                System.out.println("le mois a 31 jours");
            break;
            case 2:
                // test pour savoir si l'année st bissextile pour connaitre le nombre de jour d mois de février
                if( a%4 == 0 && a%100 !=0 || a%400==0){
                 System.out.println("le mois a 29 jours");
                }
                else{
                    System.out.println("le mois a 28 jours");
                }
            break;
            case 3:
                System.out.println("le mois a 31 jours");
            break;
            case 4:
                System.out.println("le mois a 30 jours");
            break;
            case 5:
                System.out.println("le mois a 31 jours");
            break;
            case 6:
                System.out.println("le mois a 30 jours");
            break;
            case 7:
                System.out.println("le mois a 31 jours");
            break;

            case 8:
                System.out.println("le mois a 31 jours");
            break;
            case 9:
                System.out.println("le mois a 30 jours");
            break;
            case 10:
                System.out.println("le mois a 31 jours");
            break;
            case 11:
                System.out.println("le mois a 30 jours");
            break;
            case 12:
                System.out.println("le mois a 30 jours");
            break;

        default:
                System.out.println("Mois invalide");
        }
    }
}