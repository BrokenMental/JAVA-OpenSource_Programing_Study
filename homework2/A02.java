import java.util.*;

class A02{
	double output_degree;

	void start(){
		Scanner sc = new Scanner(System.in);

		System.out.print("온도를 입력: ");
		double input_degree = sc.nextDouble();
		System.out.print("입력한 온도가 섭씨온도면 C를, 화씨온도면 F를 입력 : ");
		String kind = sc.next();
		
		switch(kind){
			case "F" :
				output_degree = (input_degree - 32) / 1.8;
				break;
			case "C" :
				output_degree = input_degree * 1.8 + 32;
				break;
		}
		System.out.printf("변환된 온도는 %.1f 입니다.\n", output_degree);
	}

	public static void main(String[] a){
		new A02().start();
	}
}
