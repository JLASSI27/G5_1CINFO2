import java.math.BigInteger;
import java.util.Scanner;
public class Charfeddinehaddouk {


        // Fonction pour calculer la factorielle d'un nombre
        public static int factorielle(int n) {
            if (n == 0)
                return 1;
            else
                return n * factorielle(n-1);
        }

    public static boolean estPair(int nombre) {
        return nombre % 2 == 0;

    }
    public static boolean estPremier(int nombre) {
        if (nombre <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0)
                return false;
        }
        return true;
    }

    public static String inverserChaine(String chaine) {
        return new StringBuilder(chaine).reverse().toString();
    }


}
