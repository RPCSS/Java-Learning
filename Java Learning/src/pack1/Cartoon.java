//7.2例题、练习题7.4：构造器初始化顺序
package pack1;

class Art {
	protected int isArtUsed;
	public Art() {
		// TODO Auto-generated constructor stub
		System.out.println("Art con'r");  //1
		isArtUsed++;  //证明已被调用，也相当于证明了基类构造器总是被调用
	}
}

class Drawing extends Art {

	public Drawing() {
		// TODO Auto-generated constructor stub
		if(isArtUsed == 1) {  //证明调用顺序，即在导出类之前调用
			System.out.println("Drawing con'r");  //2
		}

	}
}

public class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon con'r");  //3
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon x = new Cartoon();
	}

}
