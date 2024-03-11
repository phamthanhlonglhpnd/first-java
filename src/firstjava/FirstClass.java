package firstjava;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		System.out.println("Nhap ten cua ban");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("My name is" + name);
		scanner.close();
	}
}
