//p.195 10.5例题1，定义在方法中的类
package pack1.innerclasses;

public class Parcel5 {
	
	public Destination destination/*方法*/(String s) {  //注意：内部类，包括定义在方法中的类，不能用static。这个返回类型Destination是之前定义过的接口
		//这里的返回类型不能写PDestination，因为还没有定义，应该写里面那个返回类的接口，这样是一个向上转型
		//返回内部类的方法需要在外面先用接口声明，这样简单
		
		class PDestination/*定义在方法中的类*/ implements Destination {  //Parcel4.java编译单元里的Destination接口
			private String label;
			private PDestination/*构造器*/(String label) {  //<2>
				this.label = label;  //<3>
			}
			public String readLabel/*普通方法*/() {
				return label;
			}
		}
		return new PDestination(s);  //<1><4>  destination()方法返回一个PDestination类，这个类里有label域，一个构造器和一个public方法
		//注意：作用域内访问，不受private限制
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel5 p = new Parcel5();
		Destination d = p.destination("akakkss");  //返回PDestination类的引用，向上转型
		System.out.println(d.readLabel());  //新发现：返回的d类经过向上转型后保留了方法内部类所含有的方法（错误）
		//其实不是这样的，因为返回的是PDestination类，这个类本身就有readLabel方法
		//destination()退出以后，返回的这个引用仍然可以使用
	}

}
