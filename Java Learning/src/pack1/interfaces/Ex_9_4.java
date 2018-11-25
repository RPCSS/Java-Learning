//练习题9-4
package pack1.interfaces;

abstract class Original {
	static void meto(Original og) {
		System.out.println("y");
	}
}

class ExpOrg extends Original {
	void met1() {
		System.out.println("method 1");
	}
}

public class Ex_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Original v3 = new ExpOrg();
		((ExpOrg)v3).meto(v3);
		
	}

}
