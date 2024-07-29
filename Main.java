package HuntingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("choose a victim:");
        System.out.println("1: Rhino \uD83E\uDD8F");
        System.out.println("2: Deer \uD83C\uDFF4");
        System.out.println("3: Antilope \uD83E\uDD8C");
        int victimChoice = scanner.nextInt();

        System.out.println("choose a hunter:");
        System.out.println("1: Lion \uD83E\uDD81");
        System.out.println("2: Leopard \uD83D\uDC2F");
        System.out.println("3: Cheetah \uD83D\uDC06");
        int hunterChoice = scanner.nextInt();


        Victim chosenVictim = Victim.getVictim(victimChoice);
        Hunter chosenHunter = Hunter.getHunter(hunterChoice);


        Random random = new Random();
        int distance = 6;

        System.out.println("u chose a victim: " + chosenVictim.getName());
        System.out.println("u chose a hunter: " + chosenHunter.getName());

        for (int i = 0; i < 10; i++) {
            double outcome = random.nextDouble();

            if (outcome <= chosenVictim.getChance()) {
                distance++;
                System.out.println(chosenVictim.getName() + " " + ".".repeat(distance) + " " + chosenHunter.getName());
                System.out.println(chosenVictim.getName() + "ran away");
            } else {
                distance--;
                if (distance == 0) {
                    System.out.println(chosenVictim.getName() + " " + chosenHunter.getName());
                    System.out.println(chosenHunter.getName() + "caught a victim");
                    break;
                } else {
                    System.out.println(chosenVictim.getName() + " " + ".".repeat(distance) + " " + chosenHunter.getName());
                }
            }

            Thread.sleep(1000);
        }

        if (distance > 0) {
            System.out.println("victim ran away");
        }

        scanner.close();
    }
}
