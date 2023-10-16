import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {3,2,2,3};

        System.out.print(removeElement(arr, 3));
        
    }

    public static int removeElement(int[] nums, int val) {

        int[] result = new int[nums.length];

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                result[temp++] = nums[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }

        System.out.print(Arrays.toString(nums));
        return temp;
    }
}
