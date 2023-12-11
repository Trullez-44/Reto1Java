
import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        while (true) {
            boolean number = false;
            boolean uppercase = false;
            boolean lowercase = false;
            boolean signs = false;
            System.out.println("Escribe la contraseña a evaluar: ");

            String stringPassword = password.nextLine();

            if (stringPassword.length() >= 8) {

                for (int contLetter = 0; contLetter < stringPassword.length(); contLetter++) {
                    char charac = stringPassword.charAt(contLetter);
                    if (charac >= 48 && charac <= 57) {
                        number = true;
                        continue;
                    }
                    if (charac >= 65 && charac <= 90) {
                        uppercase = true;
                        continue;
                    }
                    if (charac >= 97 && charac <= 122) {
                        lowercase = true;
                        continue;
                    }
                    if (charac >= 35 && charac <= 38 || charac == 65 || charac == 94 || charac == 64 && charac == 33) {
                        signs = true;
                        continue;
                    }
                }
            }
            if (number && uppercase && lowercase && signs) {
                System.out.println("Muito bonito");
            } else {
                System.out.println("Cule contraseña pa mala vale, otra vez");
                continue;
            }
        }

    }
}
