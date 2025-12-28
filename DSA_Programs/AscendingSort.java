import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};

        Arrays.sort(arr);

        System.out.println("Ascending Order: ");
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
        }
    }
}
