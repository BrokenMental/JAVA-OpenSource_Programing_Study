import java.util.Scanner;

public class StudentScore {
	Scanner num = new Scanner(System.in);

	public void Stu() {
		System.out.println("5명의 국어, 영어, 수학 점수의 과목별 총점 및 평균 구하기");
		System.out.println("====================");

		double array[][] = new double[5][3];

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번 학생 국어, 영어, 수학 : ", i + 1);
			String stud1 = num.next();
			String stud2 = num.next();
			String stud3 = num.next();
			
			array[i][0] = Double.parseDouble(stud1);
			array[i][1] = Double.parseDouble(stud2);
			array[i][2] = Double.parseDouble(stud3);
		}

		subcalc(array);
		sutcalc(array);
	}

	public void sutcalc(double array[][]) {
		double total[] = new double[5];
		double avg[] = new double[5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				total[i] += array[i][j];
			}
			avg[i] = total[i] / 3.0;
		}
		for (int k = 0; k < 5; k++) {
			System.out.printf("%d번 학생의 총점은 %.0f, 평균은 %.1f이다.\n", k + 1, total[k], avg[k]);
		}
	}

	public void subcalc(double array[][]) {
		String name[] = { "국어", "영어", "수학" };
		double total[] = new double[3];
		double avg[] = new double[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				total[i] += array[j][i];
			}
			avg[i] = total[i] / 5.0;
		}

		for (int k = 0; k < 3; k++) {
			System.out.printf("%s총점은 %.0f이고, 평균은 %.1f 입니다.\n", name[k], total[k], avg[k]);
		}
	}
}
