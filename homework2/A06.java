import java.util.*;

class A06{

	void start(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();

		double avg = (kor + math + eng)/3;
		System.out.printf("평균은 %.1f 이고\n",avg);		
	
		grade(avg);
	}

	void grade(double avg){
		if(avg>90){
			System.out.println("학점은 A 입니다.");
		}else if(avg>80 && avg<=90){
			System.out.println("학점은 B+ 입니다.");
		}else if(avg>70 && avg<=80){
			System.out.println("학점은 B 입니다.");
		}else{
			System.out.println("학점은 C 입니다.");
		}
	}

	public static void main(String[] a){
		new A06().start();
	}
}
