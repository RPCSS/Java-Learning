package pack1.innerclasses.ex6.subp3;

class Outer {
	protected class Inner1 {
		protected int a = 9;
		private int b = 8;
	}
	
	private class Inner2 {
		protected int c = 7;
		private int d = 5;
	}
	
	
	public class Inner3 {
		protected int e = 7;
		private int f = 5;
	}
}

class Outer2 extends Outer {
	void accesstest() {
		Inner1 ei1 = new Inner1();  //继承的类可以直接创建父类的内部类
		ei1.a = 0;
		//ei1.b = 0;  //不可见
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外层类
		Outer o = new Outer();
		//内层类
		Outer.Inner1 i1 = o.new Inner1();
		i1.a = 0;
		//i1.b = 0;  //不可见：虽然i1为protected权限但b是private
		//Outer.Inner2 i2 = o.new Inner2();  //不可见，因为Inner2为private
		Outer.Inner3 i3 = o.new Inner3();
		//i3.f = 0;  //不可见
		//此例说明，单独创建的内部类，创建时遵循内部类的权限，实例中元素的使用遵循该元素的权限
	}

}
