//p.196 10.5例题1a，在任意的作用域内的类
package pack1.innerclasses;

public class Parcel6 {
	
	private void internalTracking(boolean b, String s) {
		if(b) {  //这个大括号里面是TrackingSlip的作用域
			/************/
			class TrackingSlip {
				private String id;
				{
					System.out.println("Innerclass TrackingSlip initialized");  //域先于方法被执行，如果这个类被初始化，这个语句会有输出
				}
				public TrackingSlip(String s) {
					// TODO Auto-generated constructor stub
					id = s;
				}
				void getSlip() {
					System.out.println(id);
				}
			}
			/************/
			TrackingSlip ts = new TrackingSlip(s);
			ts.getSlip();
		}/*if(b)语句块的终点*/
		//TrackingSlip ts2 = new TrackingSlip("slip");  //作用域以外，不能访问
	}
	public void track() {  //不能在static里面调用外面的非static时可以这样——先创建再调用
		internalTracking(true, "slip");  //发现：true有输出，false就没有了
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 p = new Parcel6();
		p.track();
	}

}
