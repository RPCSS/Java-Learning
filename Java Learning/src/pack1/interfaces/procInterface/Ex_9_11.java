//练习题9-11
package pack1.interfaces.procInterface;

public abstract class Ex_9_11 implements Processor{
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String wt = "abcdefhg"; 
	public static void main(String[] args) {
		Apply.process(new CharExchange(), wt);
	}
}

class CharExchange extends Ex_9_11 {
	public String process(Object input) {
		int len = ((String)input).length();
		char[] sorg = ((String)input).toCharArray();  //字符串转字符数组：String.toCharArray()
		char[] srslt = new char[len];
		if (len % 2 == 1) {
			return "error: odd num of chars";
		} else {
			for(int i = 0; i < len; i++) {
				if (i % 2 == 0) {
					srslt[i] = sorg[i + 1];
					srslt[i + 1] = sorg[i];
				}
			}
			return String.valueOf(srslt);  //字符数组转字符串String.valueOf(char[])
		}
	}
}