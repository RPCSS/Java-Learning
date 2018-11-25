package pack1;


public class TypeRefTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tred t1 = new Tred();
		Tred t2 = new Tred();
		
		System.out.println(t1.equals(t2));
		
		t1.level = 233;
		t2.level = 666;
		System.out.println(t1.level + t2.level);  //899
		System.out.println("t1.level" + "t2.level");  //t1.levelt2.level
		System.out.println("" + t1.level + t2.level);  //233666
		//算术加的优先级要高，比println高，计算完成会变成字符串输出。第三个是两个都变成字符串，因为以一个空串开头，后面的也认为是字符串
		
		t1.level = t2.level = 999;
		System.out.println(t1.equals(t2));
		
	}

}

class Tred{
	int level = 0;
	}
	
