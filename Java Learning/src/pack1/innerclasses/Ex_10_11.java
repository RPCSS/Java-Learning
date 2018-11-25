//p.196练习10.11
package pack1.innerclasses;

class Test10 {
	private class Ncl implements Ex_10_11intf {
		public void print() {
			System.out.println("exercise 10.10");
		}
	}

	Ex_10_11intf retxx() {
		return new Ncl();  //如果这个方法不是static那么直接返回内部类是可以的。否则必须先创建再返回
	}

}

public class Ex_10_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 tt = new Test10();
		Ex_10_11intf mncl = tt.retxx();
		//((Test10.Ncl)mncl).print();  //提示Ncl不可见
		//((tt.Ncl)mncl).和((tt.mncl)mncl).是不行的，因为“实例不能解析为类型”
	}

}
