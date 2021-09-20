package Array;

import java.util.Arrays;

public class Array5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = {3,1,2,4,5};
		Solution5_4 sol = new Solution5_4();
		int[] result = sol.sortArrayByParity(input);
		System.out.println(Arrays.toString(result));
	}

}

class Solution5_4{
    public int[] sortArrayByParity(int[] nums) {
        for (int i=0;i<nums.length-1;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]%2!=0 && nums[j]%2==0) {
        			int tmp = nums[j];
        			nums[j] = nums[i];
        			nums[i] = tmp;
        		}
        	}
        }
        return nums;
    }
}