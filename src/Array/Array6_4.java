package Array;

import java.util.ArrayList;
import java.util.List;

public class Array6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = {2,2};
		Solution6_4 sol = new Solution6_4();
		List<Integer> result = sol.findDisappearedNumbers(input);
		System.out.println(result.toString());
	}

}
class Solution6_4 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int val = 0;
        for (int i=0;i<nums.length;i++) {
        	val = Math.abs(nums[i])-1;
        	if(nums[val]>0) {
        		nums[val]=-nums[val];
        	}
        }
        for (int i=0;i<nums.length;i++) {
        	if(nums[i]>0)
        		result.add(i+1);
        }
        return result;
    }
}