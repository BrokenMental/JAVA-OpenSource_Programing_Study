package homework4;

import java.util.Scanner;

public class MaxAndMin {

	public void mam() {
		int max = 0, min = 0, temp = 0;
		String snum = "";

		while (true) {
			snum = pri();
			if (snum.equalsIgnoreCase("Q")) {
				break;
			} else {
				temp = Integer.parseInt(snum);
			}

			if (temp >= max) {
				max = temp;
				System.out.printf("���� max�� %d min�� %d�Դϴ�.\n", max, min);
			} else {
				min = temp;
				System.out.printf("���� max�� %d min�� %d�Դϴ�.\n", max, min);
			}

		}
		System.out.printf("���� ū ���� %d�̰�, ���� ���� ���� %d �Դϴ�.", max, min);
	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("0~100������ ���ڸ� �Է�(Q:����) >> ");
		String n2 = s.next();

		return n2;
	}
}