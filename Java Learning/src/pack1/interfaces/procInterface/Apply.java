//p.177例题：Apply用来接收Processor类并且执行其process方法
package pack1.interfaces.procInterface;

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using processor: " + p.name());
		System.out.println(p.process(s));
	}
}
