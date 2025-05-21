import java.util.Random;
import java.util.Scanner;

public class Event {
    public static void trigger(Player player, Scanner input) {
        Random rand = new Random();
        int event = rand.nextInt(2); // 0 = musuh, 1 = item

        if (event == 0) {
            Enemy enemy = new Enemy("Goblin", 30, 10);
            System.out.println("\nMusuh muncul! " + enemy.getName());
            Battle.startBattle(player, enemy, input);
        } else {
            Item potion = new Item("Potion", 20);
            player.addItem(potion);
            player.heal(potion.getHealAmount());
        }
    }
}
