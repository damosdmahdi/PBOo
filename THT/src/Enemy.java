public class Enemy {
    private String name;
    private int hp;
    private int attack;

    public Enemy(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println(name + " terkena " + damage + " damage. Sisa HP: " + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
