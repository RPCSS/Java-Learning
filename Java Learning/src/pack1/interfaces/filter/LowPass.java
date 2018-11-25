package pack1.interfaces.filter;

public class LowPass extends Filter {
	double cutoff;
	public LowPass(double cutoff) {
		// TODO Auto-generated constructor stub
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		System.out.println(cutoff);
		return input;
	}
}
