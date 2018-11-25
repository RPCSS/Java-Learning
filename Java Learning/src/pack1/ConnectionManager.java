//p.123练习题8
package pack1;

public class ConnectionManager {
	static int left = 3;
	static Connection[] ca = new Connection[3];  //创建Connection数组
	{
		/*for(Connection x : ca) {  //foreach不能用来赋值，只读。答案里用foreach赋值是错的
			x = Connection.conncreater();
			System.out.println(x);  //x仅为foreach的内部变量，不会给ca赋值
		}*/
		for(int i = 0; i < 3; i++) {
			ca[i] = Connection.conncreater();
		}
	//不能将执行语句直接放在类下面，类下面只能有赋值语句。执行语句必须在方法里，或者在不创建方法的时候用{}括起来（代码块，也可以带static前缀）。所以这里的for必须带{}否则报错
	//In java you can't simply code loops and other actions as part of the class definition, but rather as method/constructor/block definitions inside the class
	}
	public static Connection getConnection() {  //获得Connection数组的内容，在他为空时返回null
		if(left > 0) {
			System.out.println("have a conection");
			return ca[--left];
		}
		else {
			System.out.println("no conections");
			return null;
			}
	}

	public static void main(String[] args) {  //主方法和其他的static方法里不能再定义static变量。主方法里不能创建类。小心写错
		// TODO Auto-generated method stub
		ConnectionManager cm = new ConnectionManager();  //必须先创建类再使用其中的非static方法
		System.out.println(cm.left);
		cm.getConnection();
		System.out.println(cm.left);
		cm.getConnection();
		System.out.println(cm.left);
		cm.getConnection();
		System.out.println(cm.left);
		cm.getConnection();
		//System.out.println(ca[0].countflag);  //countflag是private
		System.out.println(ca[0]);  //输出null
		//ca[0].toString();  //foreach报错，for无输出，因为不是给输出流赋值
		//以上两行的原因是foreach不能给数组赋值，这个功能相当于只读遍历一个数组
		//如果用for就可以正常输出countflag的值：3
		System.out.println(ca.length);
		Connection cb = Connection.conncreater();
		System.out.println(cb);  //输出4
	}

}

class Connection {
	private static int countflag = 0;  //创建类的数量。static变量在其所在的类被调用时自动初始化
	private Connection() {
		//不能用这个构造器
	}
	
	public static Connection conncreater() {  //创建类的正确方法
		countflag++;
		return new Connection();
	}
	
	public String toString() {
		return ("" + countflag);
	}
}
