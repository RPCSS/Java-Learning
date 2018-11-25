//p.179 9.4例题
package pack1.interfaces;

interface CanFight {
	int K = 2;
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class Action {
	int K = 3;
	public void fight() {
		System.out.println(K);
	}
}

//super访问父类实验
class Hero extends Action implements CanFight, CanFly, CanSwim {
	public void swim() {
		System.out.println(super.K);  //这个super指的是extend那个类，推测原因是因为extend只能从一个类继承。去掉extends Action后提示super.K找不到
	}
	public void fly() {
		System.out.println(CanFight.K);  //问题：为什么这里不用创建CanFight的实例也能访问K（当然，也不能创建），是static final的原因吗？我觉得是，因为把上面的super.K改成Action.K会报错：不能访问非static域
	}
}

public class MultiExtend {
	public static void exf(CanFight x) {  //向上转型
		x.fight();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		exf(h);
		h.fly();
	}

}
