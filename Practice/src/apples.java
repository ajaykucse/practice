import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		aditya adi = new aditya();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name Please!");
		String temp = input.nextLine();
		adi.setName(temp);
		adi.saying();
	}

}
