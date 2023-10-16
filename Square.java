import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        
        int[] arr = {-4,-1,0,3,10};

        System.out.print(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        

        return nums;
    }
    
}
