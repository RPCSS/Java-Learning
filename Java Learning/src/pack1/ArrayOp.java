//数组添加元素实验

package pack1;

import java.util.Arrays;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
		System.arraycopy(a, 0, b, 0, 5);
		System.out.println(Arrays.toString(b));  //需要添加java.util.Arrays库
		
		int[] c = {7,8};
		int[] d = arrcat(a, c, 2);
		System.out.println(Arrays.toString(d));
	}
	
	//自制数组连接函数，将ins数组插入到src第srcIndex元素的后面
	static public int[] arrcat(int[] src, int[] ins, int srcIndex) {
		int totallen = src.length + ins.length;
		int[] cated  = new int[totallen];
		System.arraycopy(src, 0, cated , 0, srcIndex + 1 );  //0到srcIndex一共srcIndex + 1个元素
		System.arraycopy(ins, 0, cated , srcIndex + 1, ins.length );
		System.arraycopy(src, srcIndex + 1, cated , srcIndex + 1 + ins.length, src.length - 1 - srcIndex );
		//原数组从srcIndex + 1到最后是剩余的元素，连接起点从srcIndex + 1 + ins.length开始，剩余元素数量是src.length - 1 - srcIndex
		return cated;
	}
}
