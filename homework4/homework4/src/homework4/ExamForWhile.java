package homework4;

import java.io.*;
import java.util.Scanner;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("***************");
		System.out.println("반복문 연습하기");
		System.out.println("***************");

		System.out.println("1. 1부터 입력한 수까지 더하기");
		System.out.println("2. 최대값/최소값 구하기");
		System.out.println("3. 입력받은숫자의 합계와 평균 구하기");
		System.out.println("4. 원하는 구구단 출력하기");
		System.out.println("5. 짝수단/홀수단 출력하기");
		System.out.println("6. 종료하기");

		System.out.print("원하는 메뉴는 >>> ");
		int num = s.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("마지막 수를 입력(Q:종료) >> ");
			String n = s.next();
			if (n.equalsIgnoreCase("Q")){
				System.out.println("종료하셨습니다");
				break;
			}else{
				int n1 = Integer.parseInt(n);
				SumOfNumbers a = new SumOfNumbers();
				a.plus(n1);
			}
			break;

			
		case 2:
			MaxAndMin b = new MaxAndMin();
			b.mam();
			break;
			
		case 3:
			SumAndAvg c = new SumAndAvg();
			c.sav();
			break;
			
		case 4:
			GuGuDan d = new GuGuDan();
			d.ggd();
			break;
			
		case 5:
			GuGuDan2 e = new GuGuDan2();
			e.ggd2();
			break;
			
		case 6:
			System.out.println("종료하셨습니다.");
			break;
			
		}

	}

}