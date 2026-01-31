public class OverloadedAverages {

    // ----- Overloaded average methods -----

    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // ----- Test Program -----

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 5.5, 7.5, 10.5, 12.5, 15.5};

        System.out.println("===== Testing Overloaded Average Methods =====\n");

        // Short array
        System.out.print("short[] array: ");
        display(shortArray);
        System.out.println("Average (short): " + average(shortArray) + "\n");

        // Int array
        System.out.print("int[] array:   ");
        display(intArray);
        System.out.println("Average (int): " + average(intArray) + "\n");

        // Long array
        System.out.print("long[] array:  ");
        display(longArray);
        System.out.println("Average (long): " + average(longArray) + "\n");

        // Double array
        System.out.print("double[] array:");
        display(doubleArray);
        System.out.println("Average (double): " + average(doubleArray) + "\n");
    }

    // ----- Display Methods -----

    public static void display(short[] array) {
        for (short v : array) System.out.print(v + " ");
        System.out.println();
    }

    public static void display(int[] array) {
        for (int v : array) System.out.print(v + " ");
        System.out.println();
    }

    public static void display(long[] array) {
        for (long v : array) System.out.print(v + " ");
        System.out.println();
    }

    public static void display(double[] array) {
        for (double v : array) System.out.print(v + " ");
        System.out.println();
    }
}


