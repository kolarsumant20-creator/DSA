import java.util.Arrays;

public class SubArray {
    public static int[] printSubarrays(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){

                // for(int k = i; k <= j; k++){
                //     System.out.println(array[k] + " ");
                // }
                // System.out.println();

                int[] subarrays = Arrays.copyOfRange(array, i, j+1);
                System.out.println(Arrays.toString(subarrays));
                //return subarrays;
            }
        }
        return array;
    }

    public static int sumOfSubarray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += array[k];
                }
                System.out.println(sum);
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        //printSubarrays(arr);
        System.out.println(sumOfSubarray(arr));
    }
    
}
