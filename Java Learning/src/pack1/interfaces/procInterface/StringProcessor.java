//9.3例题p.177：字符串（适配器模式）
package pack1.interfaces.procInterface;

public abstract class StringProcessor implements Processor {  //public类（编译单元中的唯一类）和含有main方法的类可以指定为abstract类
	public String name() {
		return getClass().getSimpleName();  //返回该导出类的名字，与父类和接口无关
	}
	public abstract String process(Object input);  //作为抽象方法，导出此类，在子类中处理字符串
	public static String wt = "Slaves, get your ass back here!";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apply.process(new Upcase(), wt);  //向上转型：Upcase→StringProcessor→Processor
	}

}

class Upcase extends StringProcessor {
	public String process(Object input) { 
		//注意！！！新发现：继承的方法除了不能改变名字、返回类型（但可以在原类型的基础上降级，比如Object降为String）和降低访问权限以外，参数列表也不能改动（比如说Object input不能改成String s），必须原封不动。如果有类型变化，在方法体内做强制类型转换。
		//为什么这个process不是static方法却能在main里使用？main→process→Upcase.process……因为是创建了的：看process里面的参数
		return ((String)input).toUpperCase();  //优先级问题：如果写成(String)input.toUpperCase()，就会把input.toUpperCase()强制转换为String，而不是把input转换为String之后执行其toUpperCase()方法
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
