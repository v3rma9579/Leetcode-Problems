import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {

        int[] arr = { 1,2,3 };

        System.out.print(thirdMax(arr));

    }

    public static int thirdMax(int[] nums) {

        int[] result = new int[nums.length];

        int max = 0;
        int temp = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != nums[i + 1]) {
                result[temp++] = nums[i];
                count++;
            }

            if (i == nums.length - 1) {
                result[temp++] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(result));
        int[] x = new int[count];
        int newTemp = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                x[newTemp++] = result[i];
            }

        }
        Arrays.sort(x);
       
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }

        if (x.length == 1 || x.length == 2)
            return max;

        else
            return x[x.length - 3];

    }

}
