package Array;

import java.util.Arrays;

public class Array5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = {0,1,0,3,12,0};
		Solution5_3 sol = new Solution5_3();
		sol.moveZeroes(input);
		System.out.println(Arrays.toString(input));
	}

}
class Solution5_3{
    public void moveZeroes(int[] nums) {
        int readPointer =0;
        int writePointer=nums.length-1;
        
        while(readPointer<writePointer) {
        	if(nums[readPointer]==0) {
        		for(int j=readPointer;j<writePointer;j++) {
        			nums[j]=nums[j+1];
        		}
        		nums[writePointer] = 0;
        		writePointer --;
        	}
        	else {
        		readPointer ++;
        	}
        	
        }
    }
}