package pack1.innerclasses;

public class Parcel8 {
	
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			@Override public void value() {
				System.out.println(x*x);  //验证先覆盖再初始化
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
	}

}
