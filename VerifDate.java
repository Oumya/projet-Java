import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class VerifDate{

    public  boolean estValid(String chaineDate) {
        // définition du format une date
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // convertion de la chaine en  une date
            Date date = df.parse(chaineDate);

            return true;
        } catch (ParseException e) {

            return false;
        }
    }
}