//7.7向上转型测试，7.8final实验
package pack1;

import javax.print.attribute.standard.Fidelity;

class Frog {
	public void guagua() {
		System.out.println("Flappy frog");
	}
}

final class Test222 {
 	
}

/*class Test333 extends Test222 {
	
}*/  //不能从final类去继承

class Jiangzemin extends Frog {
	@Override public void guagua() {
		System.out.println("Excited frog");
	}
	public void nuchi() {
		System.out.println("I am angry!");
	}
}

public class UpcastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog jzm = new Jiangzemin();  //向上转型：父类 类名 = new 子类()
		jzm.guagua();  //向上转型：父类（Frog）引用（Frog.guagua）指向子类（Jiangzemin）重写的对象（Jiangzemin.guagua）
		//jzm.nuchi();  //向上转型丢失了子类特有的方法
		new Jiangzemin().nuchi();
	}

}
