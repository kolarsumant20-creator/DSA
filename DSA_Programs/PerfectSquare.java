import java.lang.Math;  

public class PerfectSquare {
    static boolean isPerfectSquare(int num){
        if(num >0){
            int squareRoot = (int)Math.sqrt(num);

            //System.out.println(squareRoot*squareRoot);
            return (squareRoot*squareRoot == num);
            
        }
        return false;
    }
    
    public static void main(String[] args) {
        int number = 35;

        if (isPerfectSquare(number)){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("NOT a perfect square");
        }
    }
}
