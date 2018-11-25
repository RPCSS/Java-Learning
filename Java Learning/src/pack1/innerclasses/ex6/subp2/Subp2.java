//p.195第10章练习6，包2
package pack1.innerclasses.ex6.subp2;
import pack1.innerclasses.ex6.subp1.*;

public class Subp2 {
	protected class Intreal implements Subp1 {
		public Intreal() {  //需要一个public构造器才能使第3个包的返回方法可以使用
			
		}
		protected int k = 78;

		public void print() {
			System.out.println("subp2.intreal imp.subp1");
		}
	}
}
