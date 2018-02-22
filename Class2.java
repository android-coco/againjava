/*
* @Author: yhlyl
* @Date:   2018-02-22 23:37:29
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-22 23:41:43
* 以下实例演示了如何使用 equals ()方法来判断数组是否相等：
*/
import java.util.Arrays;
public class Class2 {
	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
       	int[] ary2 = {1,2,3,4};
       	System.out.println("数组 ary 是否与数组 ary1相等? ：" + Arrays.equals(ary, ary1));
    	System.out.println("数组 ary 是否与数组 ary2相等? ：" + Arrays.equals(ary, ary2));
	}
}