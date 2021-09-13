package Array;

public class Array3_2 {

	public static void main(String[] args) {
		Solution3_2 sol = new Solution3_2();
		int[]nums = {1,1,2,2,3,4,5};
		int k = sol.removeDuplicates(nums);
		System.out.println(k);
	}

}

class Solution3_2 {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for (int j=i;j<nums.length;j++) {
        	if (nums[i] != nums[j]) {
        		i++;
        		nums[i]=nums[j];
        	}
        }
        return i+1;
    }
}