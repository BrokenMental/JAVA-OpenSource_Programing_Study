import java.util.Scanner;

public class AptPersonCount {
	public void Apt() {
		int array[] = new int[15];
		int floor[] = new int[5];
		int room[] = new int[3];
		Scanner num = new Scanner(System.in);
		int total = 0;
		int j = 0;
		int k = 0;

		for (int i = 0; i < 15; i++) {
			System.out.printf("%d0%d호에 살고 있는 사람의 숫자 : ", j + 1, k + 1);
			array[i] = num.nextInt();
			total += array[i];
			floor[j] += array[i];
			room[k] += array[i];
			k++;
			if (i % 3 == 2) {
				k=0;
				j++;
			}
		}
		System.out.printf("이 아파트에 거주자는 모두 %d명 입니다.\n", total);

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n", i + 1, floor[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n", i + 1, room[i]);
		}
	}

	public void count() {

	}
}
