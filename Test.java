import java.util.Scanner;

// classe  permettant de faire les tests sur les classes créées
public class Test {
    public static void main(String[] args) {

        // test de la classe NombreJourMoisFocntion
        System.out.println("=====Exercice2=====");
        // Instanciation de la classe
        NombreJourMoisFonction fonction = new NombreJourMoisFonction();
        // demande de l'année et du mois
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une année");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer un mois");
        int b = sc1.nextInt();
        // affichage et appel de la fonction
        System.out.println(fonction.nombreJour(a, b));

        System.out.println("=====Ecercice3=====");
        //test sur vérification d'une date
        System.out.println("Entrer une date au format jj-MM-yyy");
        Scanner sc3 = new Scanner(System.in);
        String date = sc3.nextLine();
        VerifDate verifDate = new VerifDate();
        if (verifDate.estValid(date)){
            System.out.println("la date est valide");
        }
        else{
            System.out.println("le date est invalide");
        }

        System.out.println("=====Exercice4=====");

        // test sur Exercice4v2
        Exercice4v2 exercice4v2 = new Exercice4v2();
        exercice4v2.DatePrecedenteSuivante();
    }
}
