//p.185例题：接口的嵌套，以及private接口的行为
package pack1.interfaces;

class A {
	/*A1接口，接口本身是包访问权限*/
	interface A_1 {
		void f();
		//private void g();  //接口内不能使用private
	}
	public static class A_1_Imp implements A_1 {  //注意static
		public void f() {
			System.out.println("f in A_1_Imp that implements A_1 in class A");
		}
	}
	/*A2接口，接口本身是public权限*/
	public interface A_2 {
		void f();
	}
	public static class A_2_Imp implements A_2 {
		public void f() {
			System.out.println("f in A_2_Imp that implements A_2 in class A");
		}
	}
	/*A3接口，接口本身是private权限*/
	private interface A_3 {
		void f();
	}
	public static class A_3_ImpPublic implements A_3 {  //由private接口导出的类不能在外面直接访问
		public void f() {
			System.out.println("PUBLIC f in A_3_Imp that implements A_3 in class A");
		}
	}
	private static class A_3_ImpPrivate implements A_3 {  //由private接口导出的类不能在外面直接访问
		public void f() {
			System.out.println("PRIVATE f in A_3_Imp that implements A_3 in class A");
		}
	}
	public A_3 getA3() {  //由private接口导出的类可以这样访问
		return new A_3_ImpPrivate();
	}
	private A_3 aref;
	public void receive(A_3 rcv) {  //由private接口导出的类的内部元素可以这样访问
		aref = rcv;
		aref.f();
	}
}


public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用嵌套于类的接口时，必须先创建外层的类
		//特别注意：在static main()方法里面，对于main所在类以外的类，同样只能访问他们的static对象
		//【创建类】时，使用类原来的名字，如A.A_1_Imp
		//【使用类的方法】时，使用类的实例的名字，如a.receive()
		A a = new A();
		A.A_1_Imp a2 = new A.A_1_Imp();  //注意嵌套类用类原来的名字，不能用实例的名字，比如用A.A_1_Imp而不是a.A_1_Imp
		a2.f();
		A.A_2_Imp a3 = new A.A_2_Imp();
		a3.f();
		//A.A_3_ImpPrivate a4 = new A.A_3_ImpPrivate();  //因为他的接口是private，在那个类的外部不可见，所以这里不能创建
		A.A_1_Imp a4 = new A.A_1_Imp();
		//a4.f();
		//A.A_3 a4 = a.getA3();
		a.receive(a.getA3());
	}

}
