package project;

public class fib {
	public static void main(String[] args) {
		int pastSum = 1;
		int currentSum = 0;
		int pastpastSum = 0;
		for (int i = 0; i < 100; i++) {
			currentSum = pastSum + pastpastSum;
			pastpastSum = pastSum;
			pastSum = currentSum;
			System.out.println(currentSum + ", ");
		}
	}
}
