import java.util.Arrays;

public class DescendingSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};

        Arrays.sort(arr);

        System.out.println("Ascending Order: ");
        for (int i = arr.length -1; i >=0 ; i--) {
            System.out.println(arr[i]+" ");
        }
    }
}
