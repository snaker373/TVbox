public class Main {
    public static void main(String[] args) {
        var Lamborgini = new Car();
        Lamborgini.setId(212221);
        Lamborgini.setMark("Aventodor");
        Lamborgini.setModelName("Lamborgini");
        Lamborgini.setMaxSpeed(390);
        Lamborgini.setAge(3);
        Lamborgini.setMinSpeed(0);
        Lamborgini.drive();
        var f  = Lamborgini.getinfo();
        System.out.println(f);
    }
}