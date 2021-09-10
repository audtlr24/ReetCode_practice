package Array;
public class Array2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2_1 sol = new Solution2_1();
		int[] nums = {9,0,9,0,6,0,0,0,1,1,6,5,4,4,8,3,0,0,0,1,5,3,0,0,7,2,1,0,2,0,9,1,0,2,0,0,0,0,0,0,0,6,0,0,7,9,0,8,7,0,9,7,1,0,2,0,0,0,0,9,0,0,0,0};
		sol.duplicateZeros(nums);
		for (int result : nums)
			System.out.print(result);
	}

}

class Solution2_1 {
    public void duplicateZeros(int[] arr) {
    	int cnt = 0;
        for (int i=0;i<arr.length;i++) {
        	if (i+cnt>=arr.length)
        		return;
        	if (arr[i+cnt]==0) {
        		insertZero(arr,i+cnt+1);
        		cnt++;
        	}
        }
    }
    
    public void insertZero(int[] arr, int index) {
    	for (int i=arr.length-1;i>index;i--) {
    		arr[i]=arr[i-1];
    	}
    	arr[index] = 0;
    }
    
}