public class Majority {
    public static void main(String[] args) {

        int[] arr1 = {2,2,1,1,1,1,2,2,5,7,8,9,9};
        // int[] arr2 = {3,2,3};

        System.out.print(majorityElement(arr1));
        
    }

  public static int majorityElement(int[] nums) {
       
    int maxElement = 0;    
    for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                maxElement = nums[i];
            }
        }
        return maxElement;
    }
}