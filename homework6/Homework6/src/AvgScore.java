import java.util.Scanner;

public class AvgScore {
	public void Avg() {
		double array[] = new double[10];
		double total = 0;

		Scanner num = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번 심사점수 입력 : ", i + 1);
			array[i] = num.nextDouble();
			total += array[i];
		}
		calc(array, total);

	}

	public void calc(double array[], double total) {
		double max = 0;
		double min = 0;
		
		if (array[0] > array[1]) {
			max = array[0];
			min = array[1];
		}else{
			min = array[0];
			max = array[1];
		}

		for (int j = 2; j < 10; j++) {
			if (array[j] > max) {
				max = array[j];
			}
			if (array[j] < min) {
				min = array[j];
			}
		}
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은 %.1f입니다.", (total - max - min)/8.0);

	}
}
