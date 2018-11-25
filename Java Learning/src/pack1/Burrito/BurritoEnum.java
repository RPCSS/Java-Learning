

package pack1.Burrito;
//import pack1.Burrito;  //enum Burrito在同一个包里而且是public可以调用

public class BurritoEnum {
	
	Burrito deg;
	public BurritoEnum(Burrito cst) {
		// TODO Auto-generated constructor stub
		this.deg = cst;
	}
	
	void desc() {
		System.out.println("" + deg.ordinal());
		switch (deg) {
		case A:
			System.out.println("Ass we can");
			break;
		case B:
			System.out.println("Boy next door");
			break;
		case C:
		case D:
		default:
			System.out.println("Deep Dark Fastasy");
			break;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BurritoEnum k1 = new BurritoEnum(Burrito.A); //这里的参数必须写成Burrito.A不能只写A
		k1.desc();
	}

}
