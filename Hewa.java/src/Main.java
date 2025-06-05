public class Main {
    public static void main(String[] args) {
        Animal kucing = new Kucing("Kitty");
        kucing.makan();
        kucing.bersuara();

        Animal anjing = new Anjing("Buddy");
        anjing.makan();
        anjing.bersuara();
    }
}