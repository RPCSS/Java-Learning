//p.190内部类例题1
package pack1.innerclasses;

public class Parcel1 {
	class Contents {  //内部类也是可以指定为public的。内部类可以使用跟域和方法一样的4种权限
		private int i = 666;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		public Destination(String where) {
			// TODO Auto-generated constructor stub
			this.label = where;  //内部类也可以使用this，表示this所在的那个类。这里不加this也可以
		}
		public String toString() {
			return label;
		}
	}
	
	//以下两个方法用来创建内部类
	public Contents cntCreator() {
		return new Contents();
	}
	
	public Destination destCreator(String where) {
		return new Destination(where);
	}
	
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d);
		System.out.println("need " + c.value() + " minutes");
	}
	
	public static void main(String[] args) {
		Parcel1 pp = new Parcel1();
		pp.ship("xinzhuang");
		//pp.Contents.i;  //内部类也必须先创建再使用
		//创建的方法是：[外层类名字].[嵌套类名字] 嵌套类实例名字 = [外层类实例名字].new [嵌套类名字](构造器参数)
		Parcel1.Contents outcnt = pp.new Contents();
		Parcel1.Contents outcnt2 = new Parcel1().new Contents();  //这样也行
		//或者先在外层类设置一个返回内部类的方法，再调用这个方法。把这个方法名字参数换成return后面的内容就跟上面那个方法一样了：
		Parcel1.Destination outdest = pp.destCreator("minhang");
	}

}
