import java.util.*;

class A04{

	void start(){
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();

		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		System.out.printf("입려하신 점수의 총점은 %d 이고, \n",total);
		double avg = total/3.0;
		System.out.printf("평균은 %.1f 입니다.\n",avg);

		if(kor>=90){
			System.out.println("국어 성적이 우수합니다.");
		}
		if(eng>=90){
			System.out.println("영어 성적이 우수합니다.");
		}
		if(math>=90){
			System.out.println("수학 성적이 우수합니다.");
		}
	}

	public static void main(String[] a){
		new A04().start();
	}
}
