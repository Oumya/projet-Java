import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercice4v2 {
    Date dateSuivante;
    Date datePrecedente;

    public void DatePrecedenteSuivante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir une date (jj-mm-aaaa)");
        // récupération de la date saisie par l'utilisateur
        String dateString = sc.nextLine();
        // définition du fromat à utiliser
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        format.setLenient(false);
        // test
        try {
            // conversion de la chaine de caractère en date
            Date date = format.parse(dateString);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, 1);
            // définition de la date suivante
            dateSuivante = cal.getTime();
            // définition de la précédente
            cal.add(Calendar.DATE, -2);
            datePrecedente = cal.getTime();
            // affichage des dates
            System.out.println("La date suivante est le "+format.format(dateSuivante));
            System.out.println("La date précédente est le "+format.format(datePrecedente));

        } catch (Exception e) {
            // affichage en cas d'erreur de aisie de la date
            System.out.println("Date invalide");
        }

    }
}
