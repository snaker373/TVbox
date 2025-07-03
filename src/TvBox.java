public class TvBox {
    private boolean power = false;
    private int currentVolume = 10;
    private int currentChanel = 1;

    public void togglePower() {
        power = !power;
        if (power) {
            System.out.println("Tv is on");
        } else {
            System.out.println("Tv is off");
        }
    }
    public void volumeUp() {
        if (power && currentVolume < 100) {
            currentVolume++;
            System.out.println("Volume: " + currentVolume);
        }
    }
    public void volumeDown() {
        if (power && currentVolume > 0) {
            currentVolume--;
            System.out.println("Volume: " + currentVolume);
        }
    }
    public void chanelUp() {
        if (power) {
            currentChanel++;
            System.out.println("Chanel: " + currentChanel);
        }
    }
    public void chanelDown() {
        if (power && currentChanel > 0) {
            currentChanel--;
            System.out.println("Chanel: " + currentChanel);
        }
    }

    public void showStatus() {
        System.out.println("Power: " + (power ? "on" : "off"));
        System.out.println("Volume: " + currentVolume);
        System.out.println("Chanel: " + currentChanel);
    }
}
