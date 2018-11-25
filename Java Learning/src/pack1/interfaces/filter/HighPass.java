package pack1.interfaces.filter;

public class HighPass extends Filter {
	double cutoff;
	public HighPass(double cutoff) {
		// TODO Auto-generated constructor stub
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}