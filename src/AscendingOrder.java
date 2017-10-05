import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first number.");
		x = scan.nextInt();
		System.out.println("Input second number.");
		y = scan.nextInt();
		System.out.println("Input third number.");
		z = scan.nextInt();
		scan.close();
		
		if (x > y) {
			temp = x;
			y = z;
			z = y;
		}
		
		System.out.println(x & y & z);
		
	}

}
