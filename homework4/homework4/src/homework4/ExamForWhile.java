package homework4;

import java.io.*;
import java.util.Scanner;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("***************");
		System.out.println("�ݺ��� �����ϱ�");
		System.out.println("***************");

		System.out.println("1. 1���� �Է��� ������ ���ϱ�");
		System.out.println("2. �ִ밪/�ּҰ� ���ϱ�");
		System.out.println("3. �Է¹��������� �հ�� ��� ���ϱ�");
		System.out.println("4. ���ϴ� ������ ����ϱ�");
		System.out.println("5. ¦����/Ȧ���� ����ϱ�");
		System.out.println("6. �����ϱ�");

		System.out.print("���ϴ� �޴��� >>> ");
		int num = s.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("������ ���� �Է�(Q:����) >> ");
			String n = s.next();
			if (n.equalsIgnoreCase("Q")){
				System.out.println("�����ϼ̽��ϴ�");
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
			System.out.println("�����ϼ̽��ϴ�.");
			break;
			
		}

	}

}