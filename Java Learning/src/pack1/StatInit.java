package pack1;

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	void f1(int marker) {
		System.out.println("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	Table() {
		System.out.println("Table");
		bowl2.f1(1);
	}
	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	Bowl bowl1 = new Bowl(1); //覆盖了newtable的static方法
	static Bowl bowl4 = new Bowl(4);
}

public class StatInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newcupboard.bowl1.f1(10);
		//newtable.bowl1.f1(10); //不能访问同类的非static方法
	}
	Table newtable = new Table();
	static Cupboard newcupboard = new Cupboard();

}
