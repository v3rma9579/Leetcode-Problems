import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {

        int[] arr = { 0, 1 };
        System.out.print(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);

        if(nums.length == nums[nums.length-1])
        {
            return nums.length;
        }
        for (int i = 0; i <nums.length; i++) {
            if (i != nums[i]){
                return i;
            }
        }
        return 0;
    }
}
