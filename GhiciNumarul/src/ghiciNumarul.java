import java.util.Random;
import java.util.Scanner;

public class ghiciNumarul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numarSecret = random.nextInt(100) + 1;
        int numarUtilizator = 0;
        int incercari = 0;

        System.out.println("Bine ai venit la jocul 'Ghici numărul'!");
        System.out.println("Am ales un număr între 1 și 100. Încearcă să-l ghicești!");

        while (numarUtilizator != numarSecret) {
            incercari++;

            System.out.print("Introduceți un număr: ");
            numarUtilizator = scanner.nextInt();

            if (numarUtilizator < numarSecret) {
                System.out.println("Numărul secret este mai mare! Încearcă din nou.");
            } else if (numarUtilizator > numarSecret) {
                System.out.println("Numărul secret este mai mic! Încearcă din nou.");
            }
        }

        System.out.println("Felicitări! Ai ghicit numărul " + numarSecret + " în " + incercari + " încercări.");

        scanner.close();
    }
}
