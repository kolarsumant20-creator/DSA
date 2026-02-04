import java.util.Arrays;

public class MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }

        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};

        System.out.println(Arrays.toString(numberGame(nums)));
    }
}
