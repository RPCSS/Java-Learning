//7.9.1例题
//任何类被加载时（不一定被使用），即按照由基类向导出类从里向外的顺序初始化所有static域，这些域只被初始化一次即保留到内存中
//类被初始化时，按照（基类普通域→基类构造器）→...→（最外层类普通域→最外层类构造器）的顺序
package pack1;

class Insect {
	private int i = 9;  //顺序4
	protected int j;  //顺序4
	public Insect() {  //顺序5
		// TODO Auto-generated constructor stub
		System.out.println("i=" + i + ", j=" + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 init'ed");  //顺序1
	static int printInit(String s) {  //顺序1
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k init'ed");  //顺序6
	public Beetle() {  //顺序7
		// TODO Auto-generated constructor stub
		System.out.println("k=" + k);
		System.out.println("j=" + j);
	}
	private static int x2 = printInit("static Beetle.x2 init'ed");  //顺序2
	public static void main(String[] args) {  //顺序2
		// TODO Auto-generated method stub
		System.out.println("Beetle constructor");  //顺序3
		Beetle b = new Beetle();  //顺序3
	}

}
