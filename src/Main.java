import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("créer un conflit par charfeddine");
        Scanner scanner = new Scanner(System.in);
        // Choix de la fonction pour chaque membre
        System.out.println("Choisissez la fonction pour chaque membre:");
        System.out.println("1. Jean Dupont");
        System.out.println("2. Marie Martin");
        System.out.println("3. Ahmed Kone");
        System.out.println("4. Sophie Tremblay");

        System.out.print("Charfeddinehaddouk 1: ");
        int choixMembre1 = scanner.nextInt();
        System.out.print("LouatiMarwa 2: ");
        int choixMembre2 = scanner.nextInt();
        System.out.print("mounahamrouni 3: ");
        int choixMembre3 = scanner.nextInt();
        System.out.print("Amine Jlasi 4: ");
        int choixMembre4 = scanner.nextInt();

        // Choix de la fonction pour le membre 1
        System.out.println("Fonction pour le Charfeddinehaddouk 1:");
        choisirFonctionEtCalculer(choixMembre1, scanner);

        // Choix de la fonction pour le membre 2
        System.out.println("Fonction pour le LouatiMarwa 2:");
        choisirFonctionEtCalculer(choixMembre2, scanner);

        // Choix de la fonction pour le membre 3
        System.out.println("Fonction pour le mounahamrouni 3:");
        choisirFonctionEtCalculer(choixMembre3, scanner);

        // Choix de la fonction pour le membre 4
        System.out.println("Fonction pour le Jlasi 4:");
        choisirFonctionEtCalculer(choixMembre4, scanner);

        scanner.close();
    }

    // Méthode pour choisir une fonction et effectuer les calculs
    public static void choisirFonctionEtCalculer(int choixMembre, Scanner scanner) {
        switch (choixMembre) {
            case 1:
                System.out.println("1. Calculer la factorielle d’un nombre");
                System.out.println("2. Vérifier si un nombre est pair");
                System.out.println("3. Vérifier si un nombre est premier");
                System.out.println("4. Inverser une chaine de caractères");
                System.out.print("Choix: ");
                int choixJD = scanner.nextInt();
                switch (choixJD) {
                    case 1:
                        System.out.print("Entrez un nombre pour calculer la factorielle: ");
                        int nombre = scanner.nextInt();
                        System.out.println("Résultat: " + Charfeddinehaddouk.factorielle(nombre));
                        break;
                    case 2:
                        System.out.print("Entrez un nombre pour vérifier s'il est pair: ");
                        int nombrePair = scanner.nextInt();
                        System.out.println("Résultat: " + Charfeddinehaddouk.estPair(nombrePair));
                        break;
                    case 3:
                        // Cas 6 : Vérifier si un nombre est premier
                        System.out.print("Entrez un nombre pour vérifier s'il est premier: ");
                        int nombrePremier = scanner.nextInt();
                        System.out.println("Résultat: " + Charfeddinehaddouk.estPremier(nombrePremier));
                        break;
                    case 4:
                        // Cas 7 : Inverser une chaine de caractères
                        System.out.print("Entrez une chaine de caractères à inverser: ");
                        String chaine = scanner.next();
                        System.out.println("Chaine inversée: " + Charfeddinehaddouk.inverserChaine(chaine));
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
                break;
            case 2:
                System.out.println("1. Somme d'un tableau");
                System.out.println("2. Moyenne d'un tableau");
                System.out.println("3. Rechercher l'élément maximal dans un tableau");
                System.out.println("4. Convertir une chaîne en majuscule");
                System.out.print("Choix: ");
                int choixMM = scanner.nextInt();
                switch (choixMM) {
                    case 1:
                        System.out.println("Entrez les nombres pour calculer la somme:");
                        int[] nombres1 = saisirNombres(scanner);
                        System.out.println("Résultat: " + LouatiMarwa.sommeTableau(nombres1));
                        break;
                    case 2:
                        System.out.println("Entrez les nombres pour calculer la moyenne:");
                        int[] nombres2 = saisirNombres(scanner);
                        System.out.println("Résultat: " + LouatiMarwa.moyenneTableau(nombres2));
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
                break;
            case 3:
                System.out.println("1. Trier un tableau d'entiers en ordre croissant");
                System.out.println("2. Vérifier si une chaîne est palindrome");
                System.out.println("3. Rechercher l'élément maximal dans un tableau");
                System.out.println("4. Concaténer deux tableaux");
                System.out.print("Choix: ");
                int choixAK = scanner.nextInt();
                switch (choixAK) {
                    case 1:
                        // Cas 5 : Trier un tableau d'entiers en ordre croissant
                        System.out.println("Entrez les nombres pour le tableau:");
                        int[] tableauTri = saisirNombres(scanner);
                        Arrays.sort(tableauTri);
                        System.out.println("Tableau trié en ordre croissant: " + Arrays.toString(tableauTri));
                        break;
                    case 2:
                        // Cas 6 : Vérifier si une chaîne est palindrome
                        System.out.print("Entrez une chaîne pour vérifier si elle est palindrome: ");
                        String chainePalindrome = scanner.next();
                        System.out.println("Résultat: " + mounahamrouni.estPalindrome(chainePalindrome));
                        break;
                    case 3:
                        // Cas 7 : Rechercher l'élément maximal dans un tableau
                        System.out.println("Entrez les nombres pour le tableau:");
                        int[] tableauMax = saisirNombres(scanner);
                        int max = mounahamrouni.trouverMax(tableauMax);
                        System.out.println("Élément maximal dans le tableau: " + max);
                        break;
                    case 4:
                        // Cas 8 : Concaténer deux tableaux
                        System.out.println("Entrez les nombres pour le premier tableau:");
                        int[] tab1 = saisirNombres(scanner);
                        System.out.println("Entrez les nombres pour le deuxième tableau:");
                        int[] tab2 = saisirNombres(scanner);
                        int[] concat = mounahamrouni.concatenerTableaux
                    default:
                        System.out.println("Choix invalide.");
                }
                break;
        }
    }

    private static int[] saisirNombres(Scanner scanner) {
    }
}