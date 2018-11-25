//7.1例题：继承、super关键字
package pack1;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append("dilute()");
	}
	public void apply() {
		append("apply()");
	}
	public void scrub() {
		append("scrub()");
	}
	public String toString() {
		return s;
	}
	public static void main(String[] args) {  //非public类也能有main函数。运行时使用哪个main()取决于命令行
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser {
	public void scrub() {  //重写（override）了
		append("Extended-class.scrub()");
		super.scrub();  //super关键字用来调用父类方法和域
	}
	public void foam() {
		append("Extended-class.foam()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		//super.main(args);  super不能在static方法里使用
		Cleanser.main(args);  //子类调用父类直接用父类名字即可，不用创建对象
		new DeterNew().scrub();
	}

}

class DeterNew extends Detergent {
	public void scrub() {  //覆盖的是Detergent的scrub，不是Cleanser的
		System.out.println("Double extend");
	}
}
