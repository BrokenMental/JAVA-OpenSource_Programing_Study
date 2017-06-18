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
		System.out.printf("합계는 %d 이고, 평균은 %.2f입니다.", total, avg);

	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 입력(Q:종료) >> ");
		String n3 = s.next();
		flag++;

		return n3;
	}

}