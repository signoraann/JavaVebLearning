import java.util.Scanner;
public class UserInfoModified {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("What's your name?");
	String name = scanner.nextLine();
	System.out.println("How old are you?");
	int age = scanner.nextInt();
	System.out.println("Height?");
	double height=scanner.nextDouble();
	System.out.println("Hi! My name is " + name + ". I'm " + age +" years old. My height " + height + " cm.");	
	scanner.close();

	}

}