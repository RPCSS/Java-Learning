package pack1;

public class StaOut extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaOut();
	}
	
	static {
		System.out.println("sub static");
	}  //第2步：初始化导出类static
	
	public StaOut() {
		System.out.println("sub constructor");
	}  //第4步：初始化导出类其他变量

}

class Base {
	static {
		System.out.println("base static");
	}  //第1步：初始化基类static
	
	public Base() {
		System.out.println("base constructor");
	}  //第3步：初始化基类其他变量
}
