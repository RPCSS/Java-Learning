package pack1;
import java.util.*;

public class ForComma {
	
	float a = 1.5f;

	public static void main(String[] args) {

		double base = 0.4;
		double hit = 1.344298;
		double res = 1.135455;
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			System.out.println(base * (1d + hit) / (1d + res) > rand.nextDouble());
		}
	}

}
