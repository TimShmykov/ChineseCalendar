import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> listOfColors = new HashMap<>();
        listOfColors.put(0, "черной");
        listOfColors.put(1, "зелёной");
        listOfColors.put(2, "зелёной");
        listOfColors.put(3, "красной");
        listOfColors.put(4, "красной");
        listOfColors.put(5, "желтой");
        listOfColors.put(6, "желтой");
        listOfColors.put(7, "белой");
        listOfColors.put(8, "белой");
        listOfColors.put(9, "черной");
        listOfColors.put(10, "черной");

        Map<Integer, String> listOfAnimals = new HashMap<>();
        listOfAnimals.put(0, "свиньи");
        listOfAnimals.put(1, "крысы");
        listOfAnimals.put(2, "коровы");
        listOfAnimals.put(3, "тигра");
        listOfAnimals.put(4, "заяца");
        listOfAnimals.put(5, "дракона");
        listOfAnimals.put(6, "змеи");
        listOfAnimals.put(7, "лошади");
        listOfAnimals.put(8, "овцы");
        listOfAnimals.put(9, "обезъяны");
        listOfAnimals.put(10, "курицы");
        listOfAnimals.put(11, "собаки");
        listOfAnimals.put(12, "свиньи");

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            int y = year - 1984 + 1; //
            int z = y / 60;
            int gamma; //
            int gamma2; //
            int teta;
            int tau;
            int sigma;
            int pi;
            if (z >= 1) {
                gamma = y - (60 * z);
                gamma2 = gamma;
            } else {
                if (z > 0) {
                    gamma2 = y;
                } else {
                    gamma = y - (60 * z);
                    gamma2 = gamma + 60;
                }
            }
            teta = gamma2 / 10;
            tau = gamma2 - (10 * teta);

            sigma = gamma2 / 12;
            if (sigma >= 1) {
                pi = gamma2 - (12 * sigma);
            } else {
                pi = gamma2;
            }

            if ((pi == 3) || (pi == 4) || (pi == 5)) {
                String s = listOfColors.get(tau);
                String replace = s.replace("ой", "ого");
                String answer = "Год " + replace + " " + listOfAnimals.get(pi);
                System.out.println(answer);
                System.out.println("=================");
                System.out.println("");
            } else {
                String answer = "Год " + listOfColors.get(tau) + " " + listOfAnimals.get(pi);
                System.out.println(answer);
                System.out.println("=================");
                System.out.println("");
            }
        } while (scanner.hasNextLine());
    }
}
