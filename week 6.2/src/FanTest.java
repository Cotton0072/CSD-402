public class FanTest {
    public static void main(String[] args) {

        // Fan #1 – default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default constructor):");
        System.out.println(fan1);

        // Fan #2 – argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Fan 2 (argument constructor):");
        System.out.println(fan2);

        // Demonstrate setters
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println("Fan 1 after using setters:");
        System.out.println(fan1);
    }
}
