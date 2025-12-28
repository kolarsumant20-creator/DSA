public class FoctorialNumUsingWHILE {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        while(num !=0){
            factorial = factorial * num;
            //System.out.println(factorial);
            num--;
        }
        System.out.println("factorial:" + factorial);

    }
}
