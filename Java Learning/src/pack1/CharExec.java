package pack1;

public class CharExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "American SHENGDIYAGE";
		System.out.println(s.length());
		System.out.println(s.charAt(7));  //第一个字符的索引是0
		System.out.println(s.indexOf('i', 1));
		for(char c : s.toCharArray()) {
			System.out.println(c + " ");
		}
		
		new Constructor_test(123);
		new Constructor_test(6324, "upup");
	}

}

class Constructor_test {
	Constructor_test(int i){
		System.out.println("i=" + i);
	}
	Constructor_test(int i, String s){
		System.out.println("" + i + s);
	}
}
