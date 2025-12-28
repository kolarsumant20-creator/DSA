public class PalidromeNumber {
    public static void main(String[] args) {
        int number = 45654;
        int original = number, reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed*10 + digit;
            number = number/10;
        }
        //System.out.println(reversed);
        if(reversed == original)
            System.out.println("Palidrome.");
        else
            System.out.println("NOT palidrome.");

    }
}
