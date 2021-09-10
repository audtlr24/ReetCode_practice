package Array;
public class Array1_1 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[] nums = {1,0,0,1,1,1};
		int result = sol.findMaxConsecutiveOnes(nums);
		System.out.println(result);
		
	}
}
	
class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
	        int maxCount = 0;
	        int count = 0;
	        for (int i=0;i<nums.length;i++) {
	        	if(nums[i]==1) {
	        		count +=1;
	        	}else {
	        		if(count >= maxCount)
	        			maxCount = count;
	        		count = 0;
	        	}
        	}
	        if(count >= maxCount)
    			maxCount = count;
	        return maxCount;
	    }
}

