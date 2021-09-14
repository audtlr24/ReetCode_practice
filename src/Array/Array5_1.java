package Array;

import java.util.Arrays;

public class Array5_1 {

	public static void main(String[] args) {
		int[]input = {17,18,5,4,6,1};
		Solution5_1 sol = new Solution5_1();
		int[] result = sol.replaceElements(input);
		System.out.println(Arrays.toString(result));
	}

}

class Solution5_1{
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i=arr.length-1;i>=0;i--) {
        	int k = arr[i];
        	arr[i]=max;
        	max = max>=k?max:k;
        }
        return arr;
    }
}