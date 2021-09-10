package Array;
import java.util.Arrays;

public class Array2_2 {

	public static void main(String[] args) {
		Solution2_2 sol = new Solution2_2();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		sol.merge(nums1,3,nums2,3);
		for (int i : nums1)
			System.out.print(i);
	}

}

class Solution2_2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++)
        	nums1[m+i]=nums2[i];
        Arrays.sort(nums1);
    }
}