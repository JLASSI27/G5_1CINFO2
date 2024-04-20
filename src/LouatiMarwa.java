public class LouatiMarwa {
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }
    public static double moyenneTableau(int[] tableau) {
        if (tableau.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être vide");
        }

        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }

        double moyenne = (double) somme / tableau.length;
        return moyenne;
    }

}
