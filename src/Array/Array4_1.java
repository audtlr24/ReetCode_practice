package Array;

public class Array4_1 {

	public static void main(String[] args) {
		Solution4_1 sol = new Solution4_1();
		int[]nums = {10,3,5,2};
		boolean result = sol.checkIfExist(nums);
		System.out.println(result);

	}

}

class Solution4_1 {
    public boolean checkIfExist(int[] arr) {
        for (int i=0;i<arr.length;i++) {
        	for (int j=0;j<arr.length;j++) {
        		if(i!=j && arr[i] == arr[j]*2)
        			return true;
        	}
        }
        return false;
    }
}