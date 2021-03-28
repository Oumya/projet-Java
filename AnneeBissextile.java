import java.util.Scanner;

public class AnneeBissextile{
    public static void main(String[] args) {
        // procédure permettant de demander à l'uilisateur de saisir une année à partir du clavie
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une année");
        int a = sc.nextInt();

        // test si l'année est bissextile
        if( a%4 == 0 && a%100 !=0 || a%400==0){
            // affichage à l'écran si l'année est bissextile
            System.out.println("L'année est bissextile");
        }
        else{
            // affichage à l'écran si l'année n'est pas bissextile
            System.out.println("L'année n'est pas bissextile");
        }

    }
}