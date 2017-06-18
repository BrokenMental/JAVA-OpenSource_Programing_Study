package homework4;

import java.util.Scanner;

public class GuGuDan {

	public void ggd() {
		int num = 0;
		String snum = "";

		while (true) {
			snum = pri();
			if (snum.equalsIgnoreCase("Q")) {
				System.out.println("종료하셨습니다.");
				break;
			} else {
				num = Integer.parseInt(snum);
				if (num > 1 && num < 10) {
					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", num, i, num * i);
					}
				} else {
					System.out.println("잘못 입력");
				}
			}
		}

	}

	public String pri() {
		Scanner s = new Scanner(System.in);

		System.out.print("출력하고 싶은 단(Q:종료) >> ");
		String n4 = s.next();

		return n4;
	}
}