//p.195第10章练习6，包3
package pack1.innerclasses.ex6.subp3;
import pack1.innerclasses.ex6.subp1.*;
import pack1.innerclasses.ex6.subp2.*;

public class Subp3 extends Subp2 {
	
	static Subp1 sclret() {  //向上转型
		Subp2 scltmp = new Subp2();
		Intreal it = scltmp.new Intreal();  //继承的可以直接创建父类的内部类，但在static方法里面，由于static不用创建类即可访问，因此在static方法里必须由内到外创建这些类（即使是继承）
		//it.k  //报错：不可见。内部类创建的外部类所继承父类中的内部类
		return it;  //如果Intreal类的构造器为默认的或者不是public的这里就会提示无法访问。因为Intreal与Subp3不是继承关系，非public权限不能访问，protected也不行
		//问题：Subp3继承了Subp2，而外部类可以访问其内部类的对象，为什么Subp3不能访问非public的构造器。
	}

	class Int233 extends Intreal {
		void cg() {
			k = 0;  //继承那个类，可以访问protected对象
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Subp2 scltmp = new Subp2();
		//Subp2.Intreal ss = scltmp.new Intreal();
		//ss.k = 0;
		/*Subp3 is = new Subp3();
		Int233 ii = is.new Int233();
		ii.k = 0;  */
	}

}

//class Int233 extends Subp2.Intreal {  //Subp2.Intreal不可见：protected
	
