package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q03 {

	public static void main(String[] args) {
		int numOfEven = 0;
		int cnt = Integer.parseInt(args[0]);
		int pre = 1;
		int pre_pre = 1;
		String fibb_seq = pre + " " + pre_pre;
		for (int i = 2; i < cnt; i++) {
			int current = pre + pre_pre;
			if (current % 2 == 0){
				numOfEven += 1;
			}
			fibb_seq += " " + current;
			pre_pre = pre;
			pre = current;
		
		}
		
		
		System.out.println("The first " + args[0] + " Fibonacci numbers are:");
		System.out.println(fibb_seq);
		System.out.println("The number of even numbers is: "+numOfEven);

	}

}
