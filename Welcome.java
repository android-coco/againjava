/*
* @Author: yhlyl
* @Date:   2018-02-06 22:20:18
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-06 23:06:38
*/
public class Welcome 
{
	public static void main(String[] args) 
	{

		int a = 10;
		int b = 010;
		int c = 0x10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(Integer.toBinaryString(a));//二进制
		System.out.println(Integer.toOctalString(a));//八进制
		System.out.println(Integer.toHexString(a));//十六进制

		byte x = 100;
		short z = 200;
		long y = 111111111111111L;

		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f == d);
	}
}