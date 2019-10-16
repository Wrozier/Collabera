import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = scanner.next();
		System.out.println("Enter your Age: ");
		//int age = scanner.nextInt();
		long age = scanner.nextLong();
		System.out.println(age);
	}

}
