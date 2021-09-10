package Array;
public class Array1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 sol = new Solution2();
		int[] nums = {12,345,2,6,77,1234};
		int result = sol.findNumbers(nums);
		System.out.println(result);
	}

}

class Solution2 {
    public int findNumbers(int[] nums) {
    	int count = 0;
        for (int num : nums) {
        	String numToStr = num+"";
        	if (numToStr.length()%2 == 0)
        		count += 1;
        }
        return count;
    }
}
