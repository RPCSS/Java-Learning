package pack1;

public class PrivConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pritest_Sub();
	}

}

class Pritest_Base {
	private int pri = 233;
	protected int pti = 666;
	public int pli = 999;
	
	private void priprint() {
		System.out.println("private" + pri);
	}
	
	protected void protprint() {
		System.out.println("protected" + pti);
	}
	
	public void pubprint() {
		System.out.println("public" + pli);
	}
}

class Pritest_Sub extends Pritest_Base {
	{
		super.protprint();  //非赋值代码放在代码块里
		//super.priprint();
	}
}