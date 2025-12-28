public class ReverseDigit {
    static int NumReverse(int number){
        int reverse = 0;

        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int number = 56231;
        
        System.out.println(NumReverse(number));
    }
}