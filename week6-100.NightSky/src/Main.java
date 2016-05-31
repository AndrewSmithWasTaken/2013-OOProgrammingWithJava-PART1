
public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(4000,4000);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
