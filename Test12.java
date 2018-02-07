/*
* @Author: yhlyl
* @Date:   2018-02-07 22:12:58
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-07 23:03:44
冒泡排序
*/
public class Test12 {
	public static void main(String[] args) {
		int[] nums = {34,4,56,56,90,65};
		int len = nums.length;
		//外循环控制轮数
		//比较的轮数等于数列的长度-1
		for (int i = 0; i < len-1; i ++) {
			for (int j = 0; j < len - 1 -i; j++) {
				if(nums[j] > nums[j+1]){
					nums[j] = nums[j] + nums[j + 1];
					nums[j + 1] = nums[j] - nums[j+1];
					nums[j] = nums[j] - nums[j + 1];
				}
			}
		}

		for (int n : nums ) {
			System.out.println(n);
		}
	}
}