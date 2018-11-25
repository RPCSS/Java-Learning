//toString方法实验，import重名类实验
package pack1;
import java.util.*;
import java.text.*;
import pack1.polymorphism.ExtenderIntf;
//import pack1.sub2.*;
//import pack1.sub3.*;

class AdderTst666 implements ExtenderIntf {
	public void helloinfA() {
		System.out.println("heh");
	}
}

public class Adder {
	
	static int k = 0;

	public static void main(String[] args) {
		for(int i = 1;i <= 10; i++) {
			k += i;
			Adder a = new Adder();
			System.out.println(a);//证明新建类的时候static不改变值
		}

		System.out.println(new SimpleDateFormat("yyyy/MM/dd (E) HH:mm:ss").format(new Date(1234567890000l)));
		new AdderTst666().helloinfA();
	}
	
	public String toString() {
		return ("" + k);//前面加上空字符串使return认为后面的k也是字符串，不需要类型转换。否则不匹配
	}

}
