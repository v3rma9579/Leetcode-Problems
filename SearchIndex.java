import java.util.Arrays;

public class SearchIndex {
    public static void main(String[] args) {
        int[] arr = { 1,6,8,9,3,0,3,6 };

        System.out.print(searchRange(arr, 6));

    }

    public static String searchRange(int[] nums, int target) {

        int[] result = new int[2];

        int first = -1, last = -1;

        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i] == target){
                first=i;
            }
            if(nums[j] == target ){
                last=j;
            }
            if(first > -1 && last>-1) break;
            if(first==-1) i++;
            if(last == -1) j++;

        }


        
        result[0] = first;
        result[1] = last;
        return Arrays.toString(result);
    }
}

// for (int i = 0; i < nums.length; i++) {
//     if (count == 0 && nums[i] == target) {
//         count++;
//         first = i;
//         last = i;
//     }
//     if (nums[i] == target) {
//         last = i;
//     }
// }