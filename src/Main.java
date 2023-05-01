public class Main {
    public static void main(String[] args) {
        SolarSystemPlanet planet = SolarSystemPlanet.valueOf("VENUS");
        System.out.println("VENUS has distance from Sun:" + planet.getDistanceFromSun());
    }


}