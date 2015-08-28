package concept.model;

abstract class SpaceObject {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getTimeOfOrbiting() {
        return timeOfOrbiting;
    }

    public void setTimeOfOrbiting(int timeOfOrbiting) {
        this.timeOfOrbiting = timeOfOrbiting;
    }

    private double radius;
    private double coordinateX;
    private double coordinateY;
    private int timeOfOrbiting;

}
