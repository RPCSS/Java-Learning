package pack1.interfaces.filter;
import java.util.*;

public class Waveform {
	Random rge = new Random();
	public String toString() {
		return "Waveform" + rge.nextInt();
	}
}
