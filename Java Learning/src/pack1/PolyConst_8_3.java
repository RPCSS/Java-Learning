package pack1;

class Glyph {
	void draw() {
		System.out.println("Glyph draw");
	}
	public Glyph() {
		// TODO Auto-generated constructor stub
		System.out.println("Glyph before draw");
		draw();
		System.out.println("Glyph after draw");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph, radius= " + radius);
	}
	void draw() {  //导出类的时候子类会先覆盖父类的同名方法再运行构造器
		System.out.println("RoundGlyph.draw, radius= " + radius);
	}
}
public class PolyConst_8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
	}

}
/*
 * 输出：
 * Glyph before draw
 * RoundGlyph.draw, radius= 0
 * Glyph after draw
 * RoundGlyph.RoundGlyph, radius= 5
 */