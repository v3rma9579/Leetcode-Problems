import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 23, 12, 53, 45, 31 };

        System.out.print(selectionSort(arr));

    }

    public static String selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_Index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_Index] > arr[j]) {
                    min_Index = j;
                }
            }
            int temp = arr[min_Index];
            arr[min_Index] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }
}
