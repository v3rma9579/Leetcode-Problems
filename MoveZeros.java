import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        System.out.print(moveZeroes(arr));

    }

    public static String moveZeroes(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[temp++] = nums[i];
            }
        }
        System.out.println(temp);
        while (temp < nums.length) {
            nums[temp++] = 0;
        }
        return Arrays.toString(nums);
    }
}