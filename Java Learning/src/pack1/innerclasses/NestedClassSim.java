//静态嵌套类的创建
package pack1.innerclasses;

public class NestedClassSim {
	public static class A {
		public void pt() {
			System.out.println("N");
			//System.out.println(NestedClassSim.this);  //A是static属性时将报错，因为没有创建外部类的实例并且他是非static
		}
	}
	public String toString() {
		return "NestedClassSim";
	}
}

class Btop {
	void cre() {
		//静态内部类可以不用创建外部类，直接使用“外.内”的形式创建
		NestedClassSim.A a = new NestedClassSim.A();  //去掉A的static属性时将报错，因为必须创建外部类的实例才能new非静态内部类
	}
}
