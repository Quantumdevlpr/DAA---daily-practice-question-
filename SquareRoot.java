public class SquareRoot {

    public static double binarySearchSqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        if (x == 0 || x == 1) {
            return x;
        }

        double low = 0;
        double high = x;
        double mid = 0;

        // Define a precision level
        double precision = 0.00001;

        while (high - low > precision) {
            mid = (low + high) / 2;
            double midSquared = mid * mid;

            if (midSquared == x) {
                return mid; // Found the exact square root
            } else if (midSquared < x) {
                low = mid; // Move the lower bound up
            } else {
                high = mid; // Move the upper bound down
            }
        }

        // Return the average of low and high for a more precise result
        return (low + high) / 2;
    }

    public static void main(String[] args) {
        double number = 25;
        double sqrtValue = binarySearchSqrt(number);
        System.out.printf("The square root of %.2f is approximately %.5f%n", number, sqrtValue);
    }
}