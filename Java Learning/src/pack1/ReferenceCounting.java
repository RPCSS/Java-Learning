//8.3.2例题
package pack1;

class Shared {
	private int refcount = 0;
	private static long counter = 0;  //引用计数——static一旦初始化，共享存储空间
	private final long id = counter++;  //第几个创建的对象——final每个实例一个，单独存储空间，一旦创建不可改变值
	//注意：static只能初始化一次，这里final先对id赋值再使counter加1
	//++和--的功能：赋值、改写（位置不同顺序不同）
	public Shared() {
		System.out.println("Creating " + this);
	}
	public void addref() {
		refcount++;
	}
	protected void dispose() {
		if(--refcount == 0) {  //refcount保存在Composing构造器接受的另一个类里，那个类必须创建，所以不用担心refcount在中间变成0
			System.out.println("Disposing " + this);
		}
	}
	public String toString() {
		return "Shared " + id;
	}
	/*
	 * protected void finalize() {
	 * 		System.out.println("share disposed");
	 * }
	 */
}

class Composing {
	private Shared shared;  //“组合”方法
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {  //非基本类型，特别是类，传递的都是引用
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addref();
	}
	protected void dispose() {
		System.out.println("Disposing " + this);
		shared.dispose();
	}
	public String toString() {
		return "Composing " + id;
	}
	/*
	 * protected void finalize() {
	 * 		System.out.println("composing disposed");
	 * }
	 */
}

public class ReferenceCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared = new Shared(); 
		Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
		for(Composing c : composing) {
			c.dispose();
		}

	}

}
