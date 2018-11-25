//p.195练习8
package pack1.innerclasses;

public class Ex_10_8 {

	class Inner {
		private int ii1 = 1;
		private int ii2 = 2;
		private void showIi2() { System.out.println(ii2); }
		private void hi() { System.out.println("Inner hi"); }
		}
	// Need to create objects to access private elements of Inner:
	int oi = new Inner().ii1;
	void showOi() { System.out.println(oi); }
	void showIi2() { new Inner().showIi2(); }  //外部类以外不可以访问内部类的private对象，但是外部类以内的其他对象可以访问。因为他们是同包、同类的
	void outerHi() { new Inner().hi(); }
	public static void main(String[] args) {
		Ex_10_8 out = new Ex_10_8();
		out.showOi();
		out.showIi2();
		out.outerHi();
	}
}
