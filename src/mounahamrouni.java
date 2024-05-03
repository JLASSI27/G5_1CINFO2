package PACKAGE_NAME;public class mounahamrouni {
=======
import java.util.Arrays;

public class mounahamrouni {
    public static void trierTableauCroissant(int[] tableau) {
        Arrays.sort(tableau);
    }

    public static boolean estPalindrome(String chaine) {
        int longueur = chaine.length();
        for (int i = 0; i < longueur / 2; i++) {
            if (chaine.charAt(i) != chaine.charAt(longueur - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int trouverMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static int[] concatenerTableaux(int[] tableau1, int[] tableau2) {
        int[] resultat = new int[tableau1.length + tableau2.length];
        System.arraycopy(tableau1, 0, resultat, 0, tableau1.length);
        System.arraycopy(tableau2, 0, resultat, tableau1.length, tableau2.length);
        return resultat;
    }

}
