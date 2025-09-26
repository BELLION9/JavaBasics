package operators;

public class AssignmentOpr {

	public static void main(String[] args) {
		int x;

		x = 5;
		x += 3;
		System.out.println("x += 3 -> " + x);

		x = 5;
		x -= 3;
		System.out.println("x -= 3 -> " + x);

		x = 5;
		x *= 3;
		System.out.println("x *= 3 -> " + x);

		x = 9;
		x /= 3;
		System.out.println("x /= 3 -> " + x);

		x = 10;
		x %= 3;
		System.out.println("x %= 3 -> " + x);

		x = 7;
		x &= 3;
		System.out.println("x &= 3 -> " + x);

		x = 5;
		x |= 3;
		System.out.println("x |= 3 -> " + x);

		x = 5;
		x ^= 3;
		System.out.println("x ^= 3 -> " + x);

		x = 32;
		x >>= 3;
		System.out.println("x >>= 3 -> " + x);

		x = 4;
		x <<= 3;
		System.out.println("x <<= 3 -> " + x);

	}

}
