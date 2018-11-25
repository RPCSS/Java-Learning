//p.177例题：适配器模式
package pack1.interfaces.procInterface;
import pack1.interfaces.filter.*;

class FilterAdapter implements Processor {  //创建适配器类：以目的接口为基础导出
	//在适配器中添加的使源接口程序适应目的接口的代码
	//这段代码是给下面的return filter.process使用的
	Filter filter = new Filter();
	public FilterAdapter(Filter filter) {  //向下转型
		// TODO Auto-generated constructor stub
		this.filter = filter;
	}
	//implements要求的方法定义：name和process
	public String name() {
		return filter.name();
	}
	public Waveform process(Object input) {
		return filter.process((Waveform)input);  //由根基类Object转型为具体类，属于向下转型，需要加强制转换符
	}
}

public class FilterProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waveform wwpr = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), wwpr);  //调用顺序：p.process→FilterAdapter.process→filter.process→LowPass.process
	}

}
