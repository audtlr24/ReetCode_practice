package Array;

import java.util.Arrays;

public class Array6_1 {

	public static void main(String[] args) {
		
		int[]input = {1,1,4,2,1,3};
		Solution6_1 sol = new Solution6_1();
		int result = sol.heightChecker(input);
		System.out.println(result);
	}

}

class Solution6_1{
    public int heightChecker(int[] heights) {
    	int[] tmp_heights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i =0;i<heights.length;i++) {
        	if (heights[i]!=tmp_heights[i])
        		count ++;
        }
        return count;
    }
}