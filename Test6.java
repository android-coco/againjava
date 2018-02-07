/*
* @Author: yhlyl
* @Date:   2018-02-07 21:06:18
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-07 21:33:41
*/
public class Test6 {
	public static void main(String[] args) {
		int[] nums = new int[5];

		for (int i = 0; i < 5; i++) {
			nums[i] = i + 1;
		}
		for (int i : nums) {
			System.out.println(i);
		}

		int[] nums3 = new int[]{1,2,3,4,5};

		int[] nums4 = {1,2,3,4,5};

		System.out.println(nums4.length);

		
	}
}