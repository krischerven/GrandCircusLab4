import java.util.Scanner;
import java.util.InputMismatchException;

public class GrandCircusLab4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cont = "y";
		do {
			long num;
			System.out.println("Please enter an integer.");
			try {
				num = s.nextLong();
			} catch (InputMismatchException e) {
				System.out.println("Invalid integer, try again.");
				s.nextLine(); // clear the buffer
				continue;
			}
			s.nextLine(); // clear the buffer
			System.out.println("Number Squared Cubed\n====== ====== ======");
			for (long i = 1; i <= num; ++i) {
				long i1 = String.valueOf(i).length();
				long i2 = String.valueOf(i*i).length();
				String s1 = " ".repeat((int) (Math.max(7,i1+1)-i1));
				String s2 = " ".repeat((int) (Math.max(7,i2+1)-i2));
				System.out.printf("%d%s%d%s%d%n", i, s1, (i*i), s2, (i*i*i));
			}
			System.out.println("Continue (y/n)");
			cont = s.nextLine().toLowerCase().trim();
		} while (cont.equals("y") || cont.equals("yes"));
		System.out.println("Goodbye.");
		s.close();
	}
}
