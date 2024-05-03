//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MalekBenKacem {

    // Méthode pour calculer la longueur d'une chaîne de caractères
    public int calculerLongueurChaine(String chaine) {
        return chaine.length();
    }

    // Méthode pour convertir une chaîne en majuscules
    public String convertirEnMajuscules(String chaine) {
        return chaine.toUpperCase();
    }

    // Méthode main pour tester les méthodes de la classe
    public static void main(String[] args) {
        MalekBenKacem instance = new MalekBenKacem();

        // Tester la méthode calculerLongueurChaine
        String chaine = "Bonjour le monde!";
        int longueurChaine = instance.calculerLongueurChaine(chaine);
        System.out.println("La longueur de la chaîne est : " + longueurChaine);

        // Tester la méthode convertirEnMajuscules
        String chaineEnMajuscules = instance.convertirEnMajuscules(chaine);
        System.out.println("Chaine en majuscules : " + chaineEnMajuscules);
    }
}
