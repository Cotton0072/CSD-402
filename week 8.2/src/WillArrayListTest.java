import java.util.ArrayList;
import java.util.Scanner;

public class WillArrayListTest {

    // REQUIRED METHOD
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;   // Return 0 if list is empty
        }

        Integer largest = list.get(0);

        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    // MAIN METHOD FOR TESTING
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        while (true) {
            int value = input.nextInt();
            numbers.add(value);   // 0 IS ALSO ADDED TO THE LIST

            if (value == 0) {
                break;
            }
        }

        Integer largestValue = max(numbers);

        System.out.println("The largest value in the ArrayList is: " + largestValue);
    }
}
