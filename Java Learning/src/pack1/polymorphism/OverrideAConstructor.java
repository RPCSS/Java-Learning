//构造器不能被重写override
package pack1.polymorphism;

class A {

	public A(int i) {
		System.out.println(i);
	}
}

class B extends A {
	public B(int i) {
		super(i);  //非默认构造器必须调用，写法是super(arg);
		// TODO Auto-generated constructor stub
	}

	void A() {
		System.out.println("B-A");
	}
}

public class OverrideAConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B(0);
		a.A();
	}

}
