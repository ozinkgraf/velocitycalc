public class velocitycalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double v0 = 0;
		double acc = 2.5;

		for (int t = 0; t <= 10; t++) {
			for (int a = 1; a <= 10; a++) {
				velocity(t, a, v0);
			}
		}

	}

	public static void velocity(double t, double a, double v0) {
		System.out.println(v0 + a * t);
	}

}
