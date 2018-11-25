package pack1;

public class PassingThis {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eater().eat(new Apple());
	}

}

class Eater {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Hao chi");
	}
}

class Peeler {
	static Apple peel(Apple apple) {  //static方法是不需要创建对应的类就能使用的方法
		System.out.println("peeling apple");
		return apple;
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
