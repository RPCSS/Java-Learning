//7.6例题：protected的用法
package pack1;

class Villain {
	private String name;
	protected void set(String newName) {
		name = newName;
	}
	public Villain(String name) {
		this.name = name;
	}
	public String toString() {
		return "I'm a villain and my name is " + name;
	}
}

public class Orc_7_6 extends Villain {
	private int orcnum;
	public Orc_7_6(String name, int number) {
		super(name);
		this.orcnum = number;
	}
	public void change(String name, int number) {
		set(name);  //set()是父类方法，其中的this是父类
		this.orcnum = number;
	}
	public String toString() {
		return "Orc" + orcnum + ":" + super.toString();  //必须写作super.toString()，不能只写super
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc_7_6 op = new Orc_7_6("Xijinping", 55);
		System.out.println(op);
		op.change("Jiangzemin", 26);
		System.out.println(op);
	}

}
