import java.util.Scanner;

public class OnlyNumber {
	public void Onl() {
		int array1[] = new int[10];
		int array2[] = new int[10];
		Scanner num = new Scanner(System.in);

		System.out.println("1~100사이의 숫자를 입력하세요.");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번째 숫자 : ", i + 1);
			array1[i] = num.nextInt();
			array2[i] = array1[i];
			for (int j = 0; j < i; j++) {
				if (array1[i] == array2[j]) {
					i -= 1;
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				}
			}
		}
		System.out.println("====================");

		for (int i = 9; i >= 0; i--) {
			System.out.printf("%d번째 숫자는 %d 입니다.\n", i+1, array1[i]);
		}

	}

}
