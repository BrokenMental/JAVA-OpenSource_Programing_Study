package homework4;

import java.util.Scanner;

public class SumAndAvg {
	int flag = 0;

	public void sav() {
		String snum = "";
		int total = 0;

		while (true) {
			snum = pri();
			if (snum.equalsIgnoreCase("Q")) {
				break;
			} else {
				double num = Double.parseDouble(snum);
				total += num;
			}
		}
		double avg = total / (flag-1.0);
		System.out.printf("�հ�� %d �̰�, ����� %.2f�Դϴ�.", total, avg);

	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("���ڸ� �Է�(Q:����) >> ");
		String n3 = s.next();
		flag++;

		return n3;
	}

}