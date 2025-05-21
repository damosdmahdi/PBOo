import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    Game.Regis(input);
                    break;
                case "2":
                    // Jika login berhasil, langsung masuk game
                    Player player = Game.Login(input);
                    if (player != null) {
                        Game.start(player, input);
                    }
                    break;
                case "3":
                    System.out.println("Keluar dari program...");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        input.close();
    }
}
