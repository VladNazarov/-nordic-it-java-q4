import java.util.Scanner;

public class MyFrame {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var frameLength = scanner.nextInt();
		var frameWidth = scanner.nextInt();
		var temp = scanner.nextLine();///// ������� \n ����� nextInt();
		// scanner.skip("\n"); � IntelliJ IDEA ��������, � STS - ���;
		var str = scanner.nextLine();

		if (str.length() > frameWidth - 2 || str.isEmpty() || frameLength < 3) {
			System.out.println("������");

		} else {
			var centerWidth = (frameWidth - str.length()) / 2;
			var centerLength = Math.ceil(frameLength / 2.0);

			for (int i = 0; i < frameWidth; i++) {
				System.out.print('*');
			}

			System.out.println();

			for (int i = 2; i < frameLength; i++) {
				System.out.print('*');

				for (int j = 2; j < frameWidth; j++) {

					if (j == centerWidth + 1 && i == centerLength) {
						System.out.print(str);
						j += str.length() - 1;
						continue;
					}
					System.out.print(" ");
				}

				System.out.println('*');
			}

			for (int i = 0; i < frameWidth; i++) {
				System.out.print('*');
			}
		}
	}

}
