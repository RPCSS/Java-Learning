//练习题10.7
package pack1.innerclasses;

public class Ex_10_7 {
	
	{
		System.out.println("Outer class initialized");
	}
	
	private int outerptefield = 233;  //private域
	private static void outerptemethod() {  //private方法
		System.out.println("Outer private method");
	}
	
	class Canned {  //内部类。注意内部类不能使用static
		{
			System.out.println("Inner class initialized");
		}
		void change(int i) {  //修改外部类的private方法
			outerptefield = i;
		}
		{
			outerptemethod();  //内部类在域中直接执行赋值、调用等语句也要写在大括号里
		}
	}

	public static void main(String[] args) {  //外部类的另一个方法
		// TODO Auto-generated method stub
		Ex_10_7 oit = new Ex_10_7();
		Ex_10_7.Canned cm = oit.new Canned();  //创建内部类的对象
		//把上面这一句注释掉，发现内部类的两个在域中的打印语句都不会执行了。证明外部类加载时不会主动加载内部类
		cm.change(666);  //调用该方法
		System.out.println(oit.outerptefield);
	}

}
