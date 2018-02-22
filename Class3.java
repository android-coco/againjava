/*
* @Author: yhlyl
* @Date:   2018-02-23 00:05:54
* @Last Modified by:   yhlyl
* @Last Modified time: 2018-02-23 00:09:46
* ==   equals
*/
public class Class3 {
	public static void main(String[] args) {
		Student s1 = new Student("zhangshan");
		Student s2 = new Student("zhangshan");
		System.out.println(s1 == s2);
		System.out.println(s1.getName().equals(s2.getName()));
	}
}

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}