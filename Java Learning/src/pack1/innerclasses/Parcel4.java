//从外部访问private内部类与非private内部类的private对象，练习10.8
package pack1.innerclasses;

interface Destination {
	String readLabel();
}

interface Contents {
	int value();
}

class ParcelTest {
	private class PContents implements Contents {  //private内部类在外边不可见
		private int i = 77;
		public int value() {
			return i;
		}
	}
	
	protected class PDestination implements Destination {
		private String label;
		private PDestination(String where) {
			label = where;
		}
		public String readLabel() {
			return label;
		}
	}
	
	public Contents contents() {
		return new PContents();  //向上转型
	}
	
	public Destination destination(String s) {
		return new PDestination(s);  //向上转型
	}
	
	public void accInnerPte() {  //测试外部类是否可以访问内部类的private元素
		//return PContents.extstr;  //提示：不能“用静态方式”访问非静态成员（必须先创建对象再访问）
		ParcelTest pte = new ParcelTest();  //创建外部类
		ParcelTest.PContents pcei = pte.new PContents();  //创建内部类，这个内部类是private的
		System.out.println(pcei.i);
	}
}

public class Parcel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParcelTest pt = new ParcelTest();
		Contents c = pt.contents();
		//c.i = 99;  //【新发现】直接访问会提示无法解析，不显示“不可见”，需要向下转型。因为Contents是接口，没有i对象
		//((ParcelTest.PContents)c).k = 0;  //不能向下转型，因为private内部类ParcelTest.PContents在上层类以外不可见
		//ParcelTest.PContents pc = pt.new PContents();  //提示private内部类ParcelTest.PContents在外边不可见，因此不能创建他的实例
		Destination d = pt.destination("w");
		//System.out.println(((ParcelTest.PDestination)d).label);  直接从外边访问public/protected内部类的private对象label，提示不可见
		pt.accInnerPte();  //返回77，证明外部类自身可以访问内部类的private元素
	}

}
