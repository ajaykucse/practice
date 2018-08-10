import java.util.Scanner;

public class apples {
	
	public static int factorial(int N)
	{
		if (N<=1)
			return 1;
		else return (N * factorial(N-1));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Number Please!");
		int temp = input.nextInt();
		System.out.println("Factorai of "+temp+": "+factorial(temp));
	}

}
