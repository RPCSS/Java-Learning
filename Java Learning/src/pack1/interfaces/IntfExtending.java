//接口（interface）的扩展，用extend
package pack1.interfaces;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
		System.out.println("DragonZilla--menace");
	}
	public void destroy() {
		System.out.println("DragonZilla--destroy");
	}
}

interface Vampire extends DangerousMonster, Lethal {  //接口扩展其他的接口用extends，而且后面可以跟多个接口
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
		System.out.println("VeryBadVampire--menace");
	}
	public void destroy() {
		System.out.println("VeryBadVampire--destroy");
	}
	public void kill() {
		System.out.println("VeryBadVampire--kill");
	}
	public void drinkBlood() {
		System.out.println("VeryBadVampire--drink blood");
	}
}

public class IntfExtending {
	static void u(Monster b) {
		b.menace();
	}
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) {
		l.kill();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire putin = new VeryBadVampire();
		u(putin);
		v(putin);
		w(putin);
	}

}
