public class PivotSum {
    public static void main(String[] args) {

        int[] arr = { 2, 1, -1 };

        System.out.print(pivotIndex(arr));

    }

    public static int pivotIndex(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int first = 0;
        int remSum = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            first += nums[i - 1];
            remSum = sum - first - nums[i];

            if (first == remSum)
                return i;
        }

        return -1;
    }

}
