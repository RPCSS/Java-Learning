package pack1.interfaces;

enum Notes {
	H, M, L
}

interface TesterIntf {
	int K = 255;
}

abstract class Instrument {  //抽象类前面加abstract标记
	private static int count = 0;
	private final int order = count++;  //引用计数？？？
	public abstract void play(Notes n);  //抽象方法要加abstract标记，在抽象类里面只能声明不能定义
	public String toString() {
		return "Instrument ";
	}
	public abstract void adjust();
	public void printcounter() {
		System.out.println("count=" + count + ",order=" + order);
	}
}

class Keys extends Instrument {  //abstract要用extends
	public void play(Notes n) {  //implement的方法前面有白色三角形标记，这里显示implements ...Interfaces.Keys.play
		System.out.println(n);
	}
	public void adjust() {
		System.out.println("Keys adjusting");
	}
}

class Stringed extends Instrument {  //加构造器实验
	public Notes k;
	public Stringed(Notes k) {
		// TODO Auto-generated constructor stub
		this.k = k;
	}
	public void play(Notes n) {
		System.out.println(n);
	}
	public void adjust() {
		System.out.println("Stringed adjusting");
	}
}

class Piano extends Keys {
	public void play(Notes n) {  //override的方法前面是绿色三角形标记，这里提示overrides ...Interfaces.Keys.play
		System.out.println(n);
	}
	public void adjust() {
		System.out.println("Piano adjusting");
	}
}

public class Music4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instrument ct = new Instrument();  //抽象类不能创建实例
		Keys k2 = new Keys();
		k2.play(Notes.M);
		k2.printcounter();
		Stringed s3 = new Stringed(Notes.H);
		s3.adjust();
		s3.play(s3.k);  //不要写this.k
		Instrument pt = new Piano();  //抽象类可以向上转型，这里是多级转型，也是可以的
		pt.printcounter();
	}

}
