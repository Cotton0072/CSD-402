import java.util.ArrayList;

public class Usefan {

    // Method to display a single Fan WITHOUT using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("  Speed: " + fan.getSpeed());
        System.out.println("  On: " + fan.isOn());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println();
    }

    // Method to display a collection of Fans WITHOUT using toString()
    public static void displayFans(ArrayList<Fan> fans) {
        System.out.println("Displaying all fans in the collection:\n");
        for (Fan fan : fans) {
            displayFan(fan);  // reuse the single-fan display method
        }
    }

    // Test code
    public static void main(String[] args) {

        // Create a collection of Fan objects
        ArrayList<Fan> fanList = new ArrayList<>();

        // Add fans using both constructors
        fanList.add(new Fan());  // default constructor
        fanList.add(new Fan(Fan.FAST, true, 10, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 8, "red"));
        fanList.add(new Fan(Fan.SLOW, true, 12, "green"));

        // Display all fans
        displayFans(fanList);
    }
}

