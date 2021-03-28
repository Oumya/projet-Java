import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class VerifDate1 {

    final static Scanner sc = new Scanner(System.in);

    public static boolean estValid(String chaineDate) {
        // définition du format une date
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        // test si la chaine de caractère correspond à une date valide
        try {
            // convertion de la chaine en  une date
            Date date = df.parse(chaineDate);

            return true;
        } catch (ParseException e) {

            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Entrer une date au format jj-MM-yyy");
        String date = sc.nextLine();

        if (estValid(date)) {

            System.out.println("Le format de " + date + " est correcte");
        } else {

            System.out.println(date + " n'est pas une date valide");
        }
    }
}