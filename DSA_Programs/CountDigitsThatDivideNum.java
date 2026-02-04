public class CountDigitsThatDivideNum {
    
    public int countDigits(int num) {
        int totalDisvisible = 0;
        int original  = num;

        while (num != 0) {
            int digit = num % 10;
            if(original % digit == 0){
                totalDisvisible++;
            }
            num /= 10;
        }

        return totalDisvisible;
    }

    public static void main(String[] args) {
        int num = 121;

        CountDigitsThatDivideNum obj = new CountDigitsThatDivideNum();
        System.out.println(obj.countDigits(num));
    }
}
