/*
* @Author: yhlyl
* @Date:   2018-02-22 23:18:55
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-22 23:26:13
* 面试题怎么 跳出2层循环
*/
public class Class1  
{
	public static void main(String[] args) 
	{
		//1,用标签
		ok:
		for (int i = 0; i < 10 ; i++) 
		{
			System.out.println("i="+i);
			for (int j = 0; j < 10; j++) 
			{
				if(i == 2)
				{
					break ok;
				}
				System.out.println("j="+j);
			}	
		}
		System.out.println("end");
		//2,变量			
		boolean isBreak = false;
		for (int i = 0; i < 10 && !isBreak ; i++) 
		{
			System.out.println("i="+i);
			for (int j = 0; j < 10; j++) 
			{
				if(i == 2)
				{
					isBreak = true;
				}
				System.out.println("j="+j);
			}	
		}
		System.out.println("end");
	}
}