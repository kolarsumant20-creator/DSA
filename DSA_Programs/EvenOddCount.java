public class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = {8, 56, 23, 23, 78, 32};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount = evenCount + 1; // evenCount++
            } else {
                oddCount = oddCount + 1; // oddCount++
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
