//练习10.9、10，原理与例题1、1a完全一样
package pack1.innerclasses;

interface Inusedintf {
	void print();
}

public class Ex_10_9 {
	
	public Inusedintf retface() {
		//错误记录：这里的返回类型不能写face，因为还没有定义，应该写里面那个返回类的接口，这样是一个向上转型
		class face implements Inusedintf {
			public void print() {
				System.out.println("hahhh");
			}
		}
		
		//定义在作用域的内部类
		for(int i = 1;i <= 5; i++) {
			class Inloopcls {
				public String toString() {
					return "inner loop class";
				}
			}
			System.out.println(new Inloopcls());
		}
		return new face();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_10_9 e1 = new Ex_10_9();
		Inusedintf i2 = e1.retface();
		i2.print();
	}

}
