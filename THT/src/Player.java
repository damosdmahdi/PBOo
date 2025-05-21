import java.util.ArrayList;

public class Player {
    private String name;
    private int hp;
    private ArrayList<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.inventory = new ArrayList<>();
    }

    public void showStatus() {
        System.out.println("\n--- Status Pemain ---");
        System.out.println("Nama: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Inventaris: " + (inventory.isEmpty() ? "Kosong" : ""));
        for (Item item : inventory) {
            System.out.println("- " + item.getName());
        }
    }

    public void heal(int amount) {
        hp += amount;
        if (hp > 100)
            hp = 100;
        System.out.println("HP bertambah " + amount + ". Total HP: " + hp);
    }

    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println("Kamu terkena serangan! -" + damage + " HP. Sisa HP: " + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("Kamu mendapatkan item: " + item.getName());
    }

    public int getHP() {
        return hp;
    }
}
