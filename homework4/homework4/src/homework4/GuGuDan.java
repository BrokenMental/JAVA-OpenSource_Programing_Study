package homework4;

import java.util.Scanner;

public class GuGuDan {

	public void ggd() {
		int num = 0;
		String snum = "";

		while (true) {
			snum = pri();
			if (snum.equalsIgnoreCase("Q")) {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			} else {
				num = Integer.parseInt(snum);
				if (num > 1 && num < 10) {
					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", num, i, num * i);
					}
				} else {
					System.out.println("�߸� �Է�");
				}
			}
		}

	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("����ϰ� ���� ��(Q:����) >> ");
		String n4 = s.next();

		return n4;
	}
}