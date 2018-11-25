//p.187工厂设计模式
package pack1.interfaces;

interface Services {  //主体接口
	void svc1();
	void svc2();
}

interface ServicesFactory {  //工厂接口
	Services getServices();
}

class Imp1 implements Services {  //主体类
	public void svc1() {
		System.out.println("Imp1,svc1");
	}
	public void svc2() {
		System.out.println("Imp2,svc1");
	}
}

class Imp1Fty implements ServicesFactory {  //工厂类
	public Services getServices() {
		return new Imp1();
	}
}

public class Factory {
	public static Services ftycreater(ServicesFactory sf) {  //调用工厂类的方法（必须用这种方法创建工厂类，这样才符合工厂方法的内涵），其参数为工厂类，输入该类产生一个接口
		//Services s = sf.getServices();
		//s.svc1();
		//s.svc2();
		return sf.getServices();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services s = ftycreater(new Imp1Fty());
		s.svc1();
	}

}
