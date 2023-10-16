public class SearchIndexPosition {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };

        System.out.print(searchInsert(arr, 2));

    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}