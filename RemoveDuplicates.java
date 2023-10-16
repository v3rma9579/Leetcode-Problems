import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = { 1,1,2};

        System.out.print(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        Arrays.sort(nums);

        int[] result = new int[nums.length];

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1) {
                result[temp] = nums[i];
            } else if (nums[i] != nums[i + 1]) {
                result[temp++] = nums[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            nums[i]=result[i];
        }
        System.out.println(Arrays.toString(nums));
        return (temp + 1);
    }
}