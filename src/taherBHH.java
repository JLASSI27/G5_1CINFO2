import java.util.Scanner;

public class PGCD {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre :");
        int nombre1 = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre :");
        int nombre2 = scanner.nextInt();

        int pgcd = calculerPGCD(nombre1, nombre2);
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);

        scanner.close();
    }
}






public class RacineCarree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre :");
        double nombre = scanner.nextDouble();

        double racineCarree = calculerRacineCarree(nombre);
        System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);

        scanner.close();
    }

    // Méthode pour calculer la racine carrée d'un nombre
    public static double calculerRacineCarree(double nombre) {
        if (nombre < 0) {
            throw new IllegalArgumentException("Impossible de calculer la racine carrée d'un nombre négatif");
        }
        return Math.sqrt(nombre);
    }
}

