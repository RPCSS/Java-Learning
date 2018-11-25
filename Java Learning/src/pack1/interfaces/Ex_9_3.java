//练习题8-3
package pack1.interfaces;

abstract class AbstractPrinter {
	abstract void print();  //abstract方法设置private标签会出错
	public AbstractPrinter() {  //<2>抽象类的构造器，这个遵守普通类的初始化规则，即基类先于导出类初始化
		// TODO Auto-generated constructor stub
		print();
	}
}

class AprInt extends AbstractPrinter {  //初始化时，先是子类方法覆盖导出类同名方法，然后再执行构造器。所以这里是子类print覆盖了基类的，然后执行基类构造器
	int k = 255;  //<3>这时候子类变量还没有初始化，所以显示0或者null。在子类变量初始化后，由于k被赋值，因此再次执行print才会输出
	void print() {  //<1>
		System.out.println(k);
	}
}

class AprStr extends AbstractPrinter {
	String s = "oh Niu Pi";
	void print() {
		System.out.println(s);
	}
}

public class Ex_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AprInt a = new AprInt();
		a.print();
		AprStr b = new AprStr();
		b.print();
	}

}
