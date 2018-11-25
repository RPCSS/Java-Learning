package pack1;

class Water {
	private String s;
	public Water() {
		System.out.println("Water constructed");
	}
	public String toString() {
		return "Water existing";
	}
}

class Sp {
	private String v1;  //类内域的对象引用自动初始化为null
	private Water w0 = new Water();
	private double num;  //类内基本类型自动初始化为0
	public String toString() {
		return "string=" + v1 +"; Water=" + w0 + "; double=" + num;
	}
}
public class Combined_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sp newtest = new Sp();
		System.out.println(newtest);
		//System.out.println(newtest.v1);
	}

}
