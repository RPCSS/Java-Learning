//练习题8.10
package pack1;

class A {
	protected void f() { 
		System.out.println("A.f()");
		this.g();  //调用自己的g方法
	}
	protected void g() {
		System.out.println("A.g()"); 
	}
	public static void h() {
		System.out.println("A.h()"); 
	}
}

class B extends A {
	@Override protected void g() {
		System.out.println("B.g()");
	}
	public static void h() {
		System.out.println("B.h()"); 
	}
}

public class Ex_8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.f();
		//B是继承自A的，其g方法被覆盖但是f方法不变，上面的this表示的是导出类，f方法调用被导出类覆盖的方法
		A c = new B();
		c.f();
		//父类引用指向子类的对象，按照A类创建的c的g()指向了B.g()
		c.h();
		//static方法不具有多态
	}

}
