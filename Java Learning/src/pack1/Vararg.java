//可变参数实验
package pack1;

public class Vararg {
	
	static void vaprint(int count, String... str) { //...表示数量可变的参数，必须放在参数列表的最后，并且每个方法只能有一个可变参数。
		//                         ↑类型  ↑可变参数标记
		System.out.println("Count:" + count);
		for(String sop : str) {
			System.out.print(sop + " ");
		}
		System.out.println(" ");
	}
	
	static void vrprint(String[] str) {
		System.out.println("Contents of a string array:");
		for(String sop : str) {
			System.out.println(sop);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaprint(1, "one");
		vaprint(2, "two", "three");
		vrprint(new String[] {"four", "five", "six"});
		//不能直接将参数写成{"four", "five", "six"}，而前面两个"one"可以，因为"one"视为常值（与1一样），数组{}要创建
		//数组不是基本类型，也不能视为常值
		//不能直接用new创建基本类型
	}

}

