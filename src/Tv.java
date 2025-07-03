import java.util.Scanner;

public class Tv {
    public static void main(String[] args) {
        var tv = new TvBox();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Commands: on, off, volume up, volume down, chanel up, chanel down");

        while (true) {
            System.out.println("> ");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "on":
                case "off":
                    tv.togglePower();
                    break;
                case "volume up":
                    tv.volumeUp();
                    break;
                case "volume down":
                    tv.volumeDown();
                    break;
                case "chanel up":
                    tv.chanelUp();
                    break;
                case "chanel down":
                    tv.chanelDown();
                    break;
                case "status":
                    tv.showStatus();
                    break;
                case "quit":
                    System.out.println("Goodbye");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
