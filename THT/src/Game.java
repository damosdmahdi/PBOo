import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    // Menyimpan username, password, dan data Player
    public static ArrayList<String> usr = new ArrayList<>();
    public static ArrayList<String> pss = new ArrayList<>();
    public static ArrayList<Player> players = new ArrayList<>();

    public static void Regis(Scanner input) {
        System.out.print("Input Username: ");
        String Username = input.nextLine();
        System.out.print("Input Password: ");
        String Password = input.nextLine();

        usr.add(Username);
        pss.add(Password);
        players.add(new Player(Username)); // buat Player dengan username

        System.out.println("Registrasi berhasil!");
    }

    public static Player Login(Scanner input) {
        System.out.print("Input Username: ");
        String Username = input.nextLine();
        System.out.print("Input Password: ");
        String Password = input.nextLine();

        for (int i = 0; i < usr.size(); i++) {
            if (usr.get(i).equals(Username) && pss.get(i).equals(Password)) {
                System.out.println("Login berhasil. Selamat datang, " + Username + "!");
                return players.get(i); // kembalikan Player sesuai akun
            }
        }

        System.out.println("Login gagal. Username atau password salah.");
        return null;
    }

    // Game loop
    public static void start(Player player, Scanner input) {
        boolean playing = true;
        while (playing && player.isAlive()) {
            System.out.println("\n--- Menu Game ---");
            System.out.println("1. Petualangan");
            System.out.println("2. Status");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    Event.trigger(player, input);
                    break;
                case "2":
                    player.showStatus();
                    break;
                case "3":
                    playing = false;
                    System.out.println("Keluar dari game.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        if (!player.isAlive()) {
            System.out.println("Game over! Kamu mati dalam petualangan.");
        }
    }
}
