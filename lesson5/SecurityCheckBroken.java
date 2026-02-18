import java.util.Scanner;
public class SecurityCheck {
	public static void main(String[] args) {
		system.out.println("How old are you?");
		Scanner scanner= new Scanner(System.in);
		int age = scanner.nextInt();
		if (age>=18) System.out.println("Welcome!");
		else System.out.println("Too young");
	}
}