package homework4;

import java.util.Scanner;

public class GuGuDan2 {

	public void ggd2() {
		String snum = "";

		while (true) {
			snum = pri();
			if (snum.equalsIgnoreCase("Q")) {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			} else {
				switch (snum) {
				case "E":
					for (int i = 2; i < 9; i += 2) {
						for (int j = 1; j < 10; j++) {
							System.out.printf("%d * %d = %d\n", i, j, i * j);
						}
					}
					break;

				case "O":
					for (int i = 1; i < 10; i += 2) {
						for (int j = 1; j < 10; j++) {
							System.out.printf("%d * %d = %d\n", i, j, i * j);
						}
					}
					break;

				default:
					System.out.println("�߸� �Է�");
					break;
				}
			}
		}

	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("E:¦����, O:Ȧ����(Q:����) >> ");
		String n5 = s.next();

		return n5;
	}
}