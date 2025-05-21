import java.util.Scanner;

public class Battle {
    public static void startBattle(Player player, Enemy enemy, Scanner input) {
        System.out.println("Pertarungan dimulai melawan " + enemy.getName());

        while (enemy.isAlive() && player.isAlive()) {
            System.out.println("\n--- GILIRANMU ---");
            System.out.println("1. Serang");
            System.out.println("2. Lari");
            System.out.print("Pilihan: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    int damage = 10;
                    enemy.takeDamage(damage);
                    break;
                case "2":
                    System.out.println("Kamu berhasil melarikan diri!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (enemy.isAlive()) {
                player.takeDamage(enemy.getAttack());
            }
        }

        if (!player.isAlive()) {
            System.out.println("Kamu kalah dalam pertarungan...");
        } else {
            System.out.println("Kamu menang!");
        }
    }
}
