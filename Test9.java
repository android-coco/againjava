/*
* @Author: yhlyl
* @Date:   2018-02-07 21:56:39
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-07 22:06:07
*/
public class Test9{
	public static void main(String[] args) {
		char[] cs = {'A','B','C','D','E','F','G'};
		int len = cs.length;
		for (int i = 1; i <= len; i++) {

			for(int j = i; j<len; j++){//"  "
				System.out.print(" ");
			}

			for(int j = 1; j <= i * 2 - 1; j++){//BBB
				System.out.print(cs[i-1]);
			}
			System.out.println();
		}
	}
}