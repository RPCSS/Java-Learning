package pack1;

public class Thisoput {
	
	static int value = 33;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thisoput().printv();
	}
	
	private void printv() {
		int value = 3;
		System.out.println(this.value);  //33
		System.out.println(Thisoput.value);  //33
		System.out.println(value);  //3（局部变量覆盖了全局变量）
		//此处输出为33，因为this.value是外边的static int value，printv()里的int value是局部变量不与this直接绑定
		//对于静态变量，最好使用类名不要用this，即 Thisoput.value
	}

}
