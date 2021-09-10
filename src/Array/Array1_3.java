package Array;
import java.util.Arrays;

public class Array1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 sol = new Solution3();
		int[] nums = {-7,-3,1,2,-2,11};
		int[] result = sol.sortedSquares(nums);
		for (int result_num : result)
			System.out.println(result_num);
	}

}
class Solution3 {
    public int[] sortedSquares(int[] nums) {
    	int[] square = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
        	square[i] = nums[i]*nums[i];
        }
        Arrays.sort(square);
        return square;
    }
}