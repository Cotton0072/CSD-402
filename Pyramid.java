public class Pyramid {
    public static void main(String[] args) {

        int rows = 7;  // number of lines in the pattern

        for (int i = 1; i <= rows; i++) {

            // print leading spaces
            for (int s = rows - i; s > 0; s--) {
                System.out.print("  ");
            }

            // ascending powers of 2
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // descending powers of 2
            value /= 2; // step back to last valid value
            for (int j = 1; j < i; j++) {
                value /= 2;
                System.out.print(value + " ");
            }

            // required @ symbol
            System.out.println("@");
        }
    }
}
