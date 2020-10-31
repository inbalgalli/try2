package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		int range = Integer.parseInt(args[0]);
		for (int i = 1; i <= range; i++) {
			double calc = 1 / (double)(i*2-1);
			if (i % 2 == 0) {
				piEstimation -= calc;
			}else {
				piEstimation += calc;
			}
		}
		piEstimation *= 4;
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);
	}
}