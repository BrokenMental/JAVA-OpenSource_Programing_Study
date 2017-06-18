package homework5;

import java.util.Scanner;

public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);

		System.out.println("************");
		System.out.println("반복문 연습하기 2");
		System.out.println("************");
		System.out.println("1. 정사각형 별 찍기");
		System.out.println("2. 직각삼각형 별 찍기");
		System.out.println("3. 이등변삼각형 별 찍기");
		System.out.println("4. 다이아몬드 별 찍기");
		System.out.println("5. 종료하기");
		System.out.print("원하는 메뉴는 >> ");
		int menu = s2.nextInt();

		switch (menu) {
		case 1:
			RectagleStars a = new RectagleStars();
			System.out.println("===============");
			System.out.print("정사각형 크기 입력 : ");
			int Rec = s2.nextInt();
			a.Rec(Rec);
			break;

		case 2:
			TriangleStars b = new TriangleStars();
			while (true) {
				System.out.println("===============");
				System.out.print("직각삼각형의 왼쪽여백과 높이 입력 : ");
				String num1 = s2.next();
				String num2 = s2.next();

				int Tri1 = Integer.parseInt(num1);
				int Tri2 = Integer.parseInt(num2);
				if (Tri1 > Tri2) {
					b.Tri(Tri1, Tri2);
					break;
				} else {
					System.out.println("높이가 왼쪽 여백보다 커야 합니다. ");
				}
			}
			break;

		case 3:
			IsoscelesTriangleStars c = new IsoscelesTriangleStars();
			System.out.println("===============");
			System.out.print("이등변삼각형의 높이 입력 : ");
			int Iso = s2.nextInt();
			c.Iso(Iso);
			break;

		case 4:
			DiamondStars d = new DiamondStars();
			System.out.println("===============");
			System.out.print("다이아몬드의 크기 입력 : ");
			int Dia = s2.nextInt();
			d.Dia(Dia);
			break;

		case 5:
			System.out.println("===============");
			System.out.println("종료하셨습니다.");
			break;

		}

	}

}
