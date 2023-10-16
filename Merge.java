import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int[] nums1 = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int[] nums2 = { 1, 2, 2 };

        merge(nums1, 3, nums2, nums2.length);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int temp = 0;
        
        for (int i = nums1.length-1; i>(nums1.length-1)-n; i--) {
            nums1[i]=nums2[temp++];
        }
        Arrays.sort(nums1);
    }
}
