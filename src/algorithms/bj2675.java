package algorithms;

import java.util.Scanner;

public class bj2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();

		for (int i = 0; i < tc; i++) {
			int num = scan.nextInt();
			String str = scan.next();
			String answer = "";

			for (int k = 0; k < str.length(); k++) {
				for (int j = 0; j < num; j++) {
					answer += str.charAt(k);
				}
			}

			System.out.println(answer);
		}

	}

}
