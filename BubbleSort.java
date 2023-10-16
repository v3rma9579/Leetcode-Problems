import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println(bubbleSort(arr));

    }

    public static String bubbleSort(int[] arr) {

        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return Arrays.toString(arr);
    }
}