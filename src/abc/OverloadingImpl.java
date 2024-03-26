package abc;

public class OverloadingImpl {

	OverloadingImpl() {

	}

	public int add(int a, int b) {// 3
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double add(int a, double b) {
		return a + b;
	}

	public double add(double a, int b) {
		return a + b;
	}

	public double add(double a, double b, double c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// class name + object name = new class name();
		OverloadingImpl obj1 = new OverloadingImpl();

		System.out.println("additon :" + obj1.add(1, 2.1, 2.1));
	}
}
