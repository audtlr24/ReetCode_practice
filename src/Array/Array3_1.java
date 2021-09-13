package Array;

import java.util.Arrays;

public class Array3_1 {

	public static void main(String[] args) {
		Solution3_1 sol = new Solution3_1();
		int[] nums = {3,2,2,3};
		int val = 3;
		int k = sol.removeElement(nums, val);
		System.out.println(k);
		for (int i : nums)
			System.out.print(i);
	}

}

class Solution3_1 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;                
                i++;
            }
        }
        return i;   
    }
}