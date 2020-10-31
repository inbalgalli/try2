package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q01 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String current = args[i];
			char first_char = current.charAt(0);
			int first = first_char;
			if (first % 3 == 0 && first % 2 == 0) {
				System.out.println(first_char);
			}
		}
	}
}
