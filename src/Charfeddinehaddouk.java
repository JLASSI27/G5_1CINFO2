import java.math.BigInteger;
import java.util.Scanner;
public class Charfeddinehaddouk {


        // Fonction pour calculer la factorielle d'un nombre
        static BigInteger calculateFactorial(int num) {
            if (num == 0 || num == 1) {
                return BigInteger.ONE;
            } else {
                BigInteger result = BigInteger.ONE;
                for (int i = 2; i <= num; i++) {
                    result = result.multiply(BigInteger.valueOf(i));
                }
                return result;
            }
        }

        // Fonction pour vérifier si un nombre est pair
        static boolean isEven(int number) {
            return number % 2 == 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demandez à l'utilisateur d'entrer un nombre
            System.out.print("Entrez un nombre : ");
            int userNumber = scanner.nextInt();

            // Calcul de la factorielle
            BigInteger factorialResult = calculateFactorial(userNumber);
            System.out.println("La factorielle de " + userNumber + " est : " + factorialResult);

            // Vérification si le nombre est pair
            if (isEven(userNumber)) {
                System.out.println(userNumber + " est un nombre pair.");
            } else {
                System.out.println(userNumber + " n'est pas un nombre pair.");
            }

    }


}
