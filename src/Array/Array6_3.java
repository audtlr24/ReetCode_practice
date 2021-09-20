package Array;

import java.util.Arrays;
import java.util.Collections;

public class Array6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = {1,2};
		Solution6_3 sol = new Solution6_3();
		int result = sol.thirdMax(input);
		System.out.println(result);
	}

}


class Solution6_3 {
    public int thirdMax(int[] nums) {
    	Arrays.sort(nums);
    	int count = 1;
    	int max = nums[nums.length-1];
    	for (int i=nums.length-1;i>=0;i--) {
    		if(nums[i] < max){
    			count ++;
    			max = nums[i];
    		}
    		
    		if (count >=3) {
    			return max;
    		}
    	}
    	return nums[nums.length-1];
    }
}