//例题9.3-1/2/3
//接口和抽象类的使用
package pack1.interfaces;

interface BaseProc {  //<1>用接口给出方法声明。注意interface里的方法声明全都是public，他们的导出类里面也应该是public，不要漏了标记，否则是包访问权限。java不允许导出类降低权限
	String name();
	Object process(Object s);
}

abstract class Processor implements BaseProc{  //<2>用abstract class实现公共方法
	public String name() {  //注意interface的导出类必须是public类型
		return getClass().getSimpleName();  //getSimpleName()只返回当前类的名字（如Upcase），getName()返回包名+类名（如pack1.interfaces.Upcase）
	}
}

class Upcase extends Processor {  //<3>在abstract class的导出类中实现各自的具体功能
	public String process(Object s) {  //注意interface的导出类必须是public类型
		return ((String)s).toUpperCase();  //Object类向下转型
	}
}

class Downcase extends Processor {
	public String process(Object s) {  //注意interface的导出类必须是public类型
		return ((String)s).toLowerCase();
	}
}

public class CharProcessor {
	public static void process(Processor p, String s) {  //注意static main()方法内不能访问非static对象
		System.out.println("Using processor: " + p.name());
		System.out.println(p.process(s));
	}
	static String wt = "Slaves, get your ass back here!";  //注意static main()方法内不能访问非static对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(), wt);  //输入参数是一个类，则必须新建一个类，否则不存在，会报错
		
	}

}
