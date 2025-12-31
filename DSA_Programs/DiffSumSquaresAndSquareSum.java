public class DiffSumSquaresAndSquareSum {
    
    static int Difference(int number){

        int sumSquare = 0;
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sumSquare = sumSquare + i*i;
            sum = sum + i;
        }
        
        int squareOfSum = sum*sum;

        int diff = squareOfSum - sumSquare;
        return diff;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(Difference(number));

    }
}
