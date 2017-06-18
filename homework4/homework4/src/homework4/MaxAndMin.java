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
				System.out.printf("현재 max는 %d min은 %d입니다.\n", max, min);
			} else {
				min = temp;
				System.out.printf("현재 max는 %d min은 %d입니다.\n", max, min);
			}

		}
		System.out.printf("가장 큰 수는 %d이고, 가장 작은 수는 %d 입니다.", max, min);
	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
		String n2 = s.next();

		return n2;
	}
}