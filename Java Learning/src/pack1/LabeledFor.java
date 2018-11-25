package pack1;

public class LabeledFor {

	public static void main(String[] args) {
		int i = 0;
		outer: //标签冒号后面另起一行，不要紧跟
			for(;true ;) {
				inner:
					for(; i < 10; i++) {
						System.out.println("i=" + i);
						
						if(i == 2) {
							System.out.println("continue");
							continue;
						}
						
						if(i == 3) {
							System.out.println("break");
							i++; //跳过递增表达式，在这里递增，否则i永远不会递增
							break;
						}
						
						if(i == 7) {
							System.out.println("continue outer");
							i++; //continue label跟break一样跳过内部循环递增表达式，在这里递增，否则i永远不会递增
							continue outer;
						}
						
						if(i == 8) {
							System.out.println("break inner");
							break outer; //离开outer标签后面的那个循环
						}
						
						for(int k = 0; k < 5; k++) {
							if(k == 3) {
								System.out.println("continue inner");
								continue inner;  //k被回收了
								//inner回到内部循环。会执行一次这个循环的递增表达式
								//continue label会执行标签后面那个循环的递增表达式
							}
						}
					}
			}
	}

}
