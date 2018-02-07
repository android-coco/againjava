/*
* @Author: yhlyl
* @Date:   2018-02-07 21:34:47
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-07 21:55:06
*/
import java.util.Scanner;
import java.util.Random;//生成随机数 伪随机数
public class Test8 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		int len = nums.length;
		Random r = new Random();//创建一个可以生成随机数的工具
		for (int i =0;i<len; i++ ) {
			nums[i] = r.nextInt(50);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要猜的数：（50以内）");

		int first = 0;
		if(input.hasNextInt()){
			first = input.nextInt(); 
		}else{
			// 输入错误的信息
            System.out.println("输入的不是整数！");
		}
		input.close(); 

		boolean flag = false;
		for (int x : nums) {
			if(first == x){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("恭喜您猜对了！");
		}else{
			System.out.println("没猜对，加油!");
		}
	}
}