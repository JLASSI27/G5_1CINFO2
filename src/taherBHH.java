import java.util.Scanner;

public class taherBHH {
    // Méthode pour calculer le PGCD de deux nombres
    public static int calculerPGCD(int a, int b) {
        // Utilisation de l'algorithme d'Euclide
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        // Méthode pour calculer la racine carrée d'un nombre
        public static double calculerRacineCarree(double nombre) {
            if (nombre < 0) {
                throw new IllegalArgumentException("Impossible de calculer la racine carrée d'un nombre négatif");
            }
            return Math.sqrt(nombre);
        }
    }







