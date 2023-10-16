public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};

        System.out.print(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {

        int temp = 0;
        int result = nums[temp];
        
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == result) {
                result = nums[temp++];
            }
        }

        return result;
    }
}