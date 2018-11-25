//p.191例题、练习题10.2，10.4
package pack1.innerclasses;
import java.util.*;

interface Selector {
	boolean end();  //判断是否到尾部
	Object current();  //返回当前下标的元素值
	void next();  //增加下标
}

public class Sequence {
	
	Random rg = new Random();
	
	public class Instring {
		String istr = "K" + rg.nextInt(99);
		public String toString() {
			return istr;
		}
	}
	
	private Object[] items;  //数组——在不能确定元素、参数的类型时或者需要方法的泛用性时，用Object作为类型最方便
	private int next = 0;  //位置、下标
	public Sequence(int size) {  //构造器，创建数组
		// TODO Auto-generated constructor stub
		items = new Object[size];
	}
	public void add(Object x) {  //向数组内添加元素
		if(next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector {  //操作数组的方法。注意：这个是从Selector导出的，可以向上转型
		private int i = 0;
		public boolean end() { 
			return i == items.length;  //这是一个判断语句，返回true false
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i < items.length) {  //调试时发现这里写成了next < items.length，由于上面添加元素之后已经使next == 10，所以这里条件不成立，i不会增加，导致下面一直输出0
				i++;
			}
		}
		public Sequence retOuter() {
			return Sequence.this;  //对外部类的引用：[外部类名字].this
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence = new Sequence(10);
		for (int k = 0; k < 10; k++) {
			sequence.add(sequence.new Instring());  //特别注意创建内部类的方法
		}
		Selector selector = sequence.new SequenceSelector();  //内部类的向上转型
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}

}
