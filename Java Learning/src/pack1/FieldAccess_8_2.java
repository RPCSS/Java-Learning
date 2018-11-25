//p.156 8.2.5例题：继承与域、向上向下转型
package pack1;

class Super {
	public int field = 0;
	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;
	public int getField() {
		return field;
	}
	public int getSuperField() {
		return super.field;
	}
}

public class FieldAccess_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Sub();  //向上转型时，域是右边子类对象的，不受多态影响
		//向上转型时，将父类的引用指向子类的方法。如果父类没有这个方法而子类有则会报错（方法未定义）。比如sup.getSuperField()，父类没有这个方法，自然不能指向子类的对象
		System.out.println("sup.field=" + sup.field + " , sup.getField()=" + sup.getField());
		Sub sub = new Sub();
		//向下转型作用于已经向上转型了的类转型之后可以使用父类没有这个方法而子类有的方法
		System.out.println("sub.field=" + sub.field + " , sub.getField()=" + sub.getField() + " , sub.getSuperField()=" + sub.getSuperField());
		System.out.println("sub.field=" + ((Sub)sup).field + " , sub.getField()=" + ((Sub)sup).getField() + " , sub.getSuperField()=" + ((Sub)sup).getSuperField());

	}

}

