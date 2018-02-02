/*
* @Author: yhlyl
* @Date:   2018-02-03 01:19:13
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-03 01:25:27
*/
public class TestLesson003 
{
	public static void main(String[] args) 
	{
		int a = 100;
		int b = 10;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		short a1 = 10;
		short b1 = 20;

		short c1 = (short)(a1 + b1);
		System.out.println(c1);

		short d = (short)(32767 + 1);
		System.out.println(d);
	}
}