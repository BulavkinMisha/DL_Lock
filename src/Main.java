public class Main {

    public static void main(String[] args) {

        final Snys.Aue alphonse = new Snys.Aue("Adolf");
        final Snys.Aue gaston = new Snys.Aue("Skin Head");
        new Thread(() -> alphonse.sorry(gaston)).start();
        new Thread(() -> gaston.sorry(alphonse)).start();

    }
}