import java.util.Scanner;

public class SecondMax {

	public void Sec() {
		int array[] = new int[10];
		int first = 0;
		int second = 0;
		int x = 0;

		Scanner num = new Scanner(System.in);
		System.out.println("10개의 숫자를 입력받아 배열에 저장하고 두번째로 큰 수를 출력하라");
		System.out.println("====================");

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번째 수를 입력하시오 : ", i + 1);
			array[i] = num.nextInt();
			if(i==0){
				first = array[0];
			}else if (i > 0 && i < 2) {
				if (array[i - 1] > array[i]) {
					first = array[i - 1];
					second = array[i];
				} else {
					first = array[i];
					second = array[i - 1];
				}
			} else if (i >= 2 && i < 10) {
				if (array[i] > first) {
					second = first;
					first = array[i];
				} else {
					if (array[i] > second) {
						second = array[i];
					}
				}
			}
			System.out.printf("현재 max1 = %d, max2 = %d 입니다.\n", first, second);
			
			for (int j = 0; j < 10; j++) {
				if (array[j] == second) {
					x = j+1;
				}
			}
		}
		System.out.printf("두번째로 큰 수는 %d번째 수 %d입니다.\n",x, second);
	}
}
