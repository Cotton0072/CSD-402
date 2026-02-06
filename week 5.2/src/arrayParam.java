public class arrayParam {

    // ---------------------------
    // Locate Largest (double[][])
    // ---------------------------
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // ------------------------
    // Locate Largest (int[][])
    // ------------------------
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // ----------------------------
    // Locate Smallest (double[][])
    // ----------------------------
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------------------------
    // Locate Smallest (int[][])
    // -------------------------
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------------------------
    // Test Program (Optional)
    // -------------------------
    public static void main(String[] args) {

        int[][] intArray = {
                {3, 8, 2},
                {5, 1, 9},
                {4, 7, 6}
        };

        double[][] doubleArray = {
                {1.2, 9.5, 3.3},
                {4.4, 2.1, 8.8}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest int at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");

        System.out.println("Largest double at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest double at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}
