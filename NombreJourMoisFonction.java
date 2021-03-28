import java.util.Scanner;

public class NombreJourMoisFonction {
    public String  nombreJour(int annee, int mois){
        String message ="";
        switch(mois){
            case 1:
                message+="le mois a 31 jours";
            break;
            case 2:
                if( annee%4 == 0 && annee%100 !=0 || annee%400==0){
                    message+="le mois a 29 jours";
                }
                else{
                    message+="le mois a 28 jours";
                }
            break;
            case 3:
                message+="le mois a 31 jours";
            break;
            case 4:
                message+="le mois a 30 jours";
            break;
            case 5:
                message+="le mois a 31 jours";

            break;
            case 6:
                message+="le mois a 30 jours";
            break;
            case 7:
                message+="le mois a 31 jours";
            break;

            case 8:
                message+="le mois a 31 jours";
            break;
            case 9:
                message+="le mois a 30 jours";
            break;
            case 10:
                message+="le mois a 31 jours";
            break;
            case 11:
                message+="le mois a 30 jours";
            break;
            case 12:
                message+="le mois a 31 jours";
            break;

        default:
            System.out.println("Mois invalide");
        }
        return message;
    }
}