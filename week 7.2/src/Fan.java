public class Fan {

    // Speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

    // No-argument constructor
    public Fan() {
        // defaults already set above
    }

    // Full-argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Fan State:\n" +
                "Speed: " + speed + "\n" +
                "On: " + on + "\n" +
                "Radius: " + radius + "\n" +
                "Color: " + color + "\n";
    }
}
