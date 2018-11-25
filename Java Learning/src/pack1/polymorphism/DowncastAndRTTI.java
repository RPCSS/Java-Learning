//向下转型：子类指向父类
package pack1.polymorphism;

class Base {
	void f() {
		System.out.println("f-base");
	}
}

class Sub extends Base {
	void f() {
		System.out.println("f-sub");
	}
	void g() {
		System.out.println("g");
	}
}

public class DowncastAndRTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bb = new Sub();
		bb.f();
		//bb.g();  //找不到——向上转型：以父类为基础（这就是称为“向上”的原因），父类域不变，子类拥有的父类方法指向子类（即子类覆盖了父类的方法，private和final除外），父类没有而子类有的方法不起作用
		//但是如果向接口转型就不会有这个问题，因为接口就是要扩展其他方法的
		
		((Sub)bb).f();
		((Sub)bb).g();  //强制向下转型（需要使用强制转换符(Type)），可以找到g方法了
		//“向下”——向上转型的类是以父类为基础的
		//向下转型只针对【已经向上转型】的类
	}

}
