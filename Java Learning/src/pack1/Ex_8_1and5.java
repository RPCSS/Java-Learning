//练习题8.1、8.5
package pack1;

class Cycle {
	public void ride() {
		System.out.println("ride?");
	}
	protected int wheels() {
		int wnum = 0;
		return wnum;
	}
}

class Bicycle extends Cycle {
	@Override public void ride() {
		System.out.println("ride bicycle with " + this.wheels() + " wheels");
	}
	@Override protected int wheels() {
		int wnum = 2;
		return wnum;
	}
}

class Tricycle extends Cycle {
	@Override public void ride() {
		System.out.println("ride tricycle with " + this.wheels() + " wheels");
	}
	@Override protected int wheels() {
		int wnum = 3;
		return wnum;
	}
}
public class Ex_8_1and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tricycle trc = new Tricycle();
		trc.ride();
	}

}
