//7.8例题：函数的final参数
package pack1;

class Gizmo {
	public void spin() {
		System.out.println("Gizmo.spin()");
	}
}

final class FclassBase {
	
}

/*
 * class ExtFromFcls extends FclassBase {  //final类不能被继承
 * 
 * }
 */
	


public class FinalArguments {
	void with(final Gizmo g) {
		//g = new Gizmo();  //final参数不能在方法中改变
	}
	void fn(final int i) {
		//i++;  //final参数不能在方法中改变
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
