public enum SolarSystemPlanet {
    MERCURY(1, 0, 57.91, 2439.7, null),
    VENUS(2, 108.2, 108.2, 6051.8, MERCURY),
    EARTH(3, 149.6, 149.6, 6371.0, VENUS),
    MARS(4, 227.9, 227.9, 3389.5, EARTH),
    JUPITER(5, 778.3, 778.3, 69911, MARS),
    SATURN(6, 1427.0, 1427.0, 58232, JUPITER),
    URANUS(7, 2871.0, 2871.0, 25362, SATURN),
    NEPTUNE(8, 4497.1, 4497.1, 24622, URANUS),
    PLUTO(9, 5906.4, 5906.4, 1188.3, NEPTUNE);

    private int orderFromSun;
    private double distanceFromPrevious;
    private double distanceFromSun;
    private double radius;
    private SolarSystemPlanet previousPlanet;

    SolarSystemPlanet(int orderFromSun, double distanceFromPrevious, double distanceFromSun, double radius,
                      SolarSystemPlanet previousPlanet) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }
    public int getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystemPlanet getPreviousPlanet() {
        return previousPlanet;
    }
}

