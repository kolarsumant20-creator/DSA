public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 15, 25, 35, 4};

        double sum = 0;

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        for (int i =0; i<numbers.length; i++)
        {
            sum = sum +numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
