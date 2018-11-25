//7.2例题：含参构造器的调用
package pack1;

class Game {
	public Game(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Game c'r");
	}
}

public class Chess_7_2 extends Game {
	
	public Chess_7_2() {
		// TODO Auto-generated constructor stub
		super(1);  //含参数构造器必须带参数调用，并且调用代码必须在导出类构造器的第一行
		System.out.println("Chess c'r");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess_7_2 x = new Chess_7_2();
		try {
			
		} finally {
			// TODO: handle finally clause
			System.out.println("finally block");
		}
	}

}
