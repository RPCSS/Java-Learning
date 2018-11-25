//终止条件和finalize()方法
package pack1;

public class TermCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TermTest();
		System.gc();
	}

}

class TermTest {
	protected void finalize() {
		System.out.println("success");
	}
}
