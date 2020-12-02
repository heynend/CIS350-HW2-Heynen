package heynend;

public class SimpleCalculator {
	public int add(int a, int b) {
			return a + b;
		}
		public int sub(int a, int b) {
			return a - b;
		}
		public int mul(int a, int b) {
			return a * b;
		}
		public int div(int a, int b) {
			return a / b;
		}
		public int square(int a) {
			return a*a;
		}
		public int greater(int a, int b) {
			if (a > b) return a;
			else return b;
		}
		public static final void main(String[] args) {
		System.out.println("Hey there CIS350.");
		}
}
