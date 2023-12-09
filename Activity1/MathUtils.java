public class MathUtils {
    // Static method to calculate the average of an array of numbers
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0; // Avoid division by zero
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}