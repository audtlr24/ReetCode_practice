package Array;

public class Array4_2 {

	public static void main(String[] args) {
		Solution4_2 sol = new Solution4_2();
		int[]nums = {1};
		boolean result = sol.validMountainArray(nums);
		System.out.println(result);

	}

}

class Solution4_2 {
    public boolean validMountainArray(int[] arr) {
    	if (arr.length<3) {
    		return false;
    	}
    	int code = 0;
    	if (arr[0]>arr[1]) {
    		return false;
    	}
    	for (int i=1;i<arr.length-1;i++) {
    		if (code == 0) {
	    		if(arr[i-1]<arr[i] && arr[i]<arr[i+1]) {
	    			continue;
	    		}
	    		else if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
	    			code =1;
	    		}
	    		else {
	    			return false;
	    		}
    		}
    		else {
    			if(arr[i-1]>arr[i] && arr[i]>arr[i+1]) {
    				continue;
    			}
    			else {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
