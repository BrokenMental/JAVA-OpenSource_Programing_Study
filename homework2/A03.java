import java.util.*;

class A03{

	int days, seconds, m_count;

	void start(){
		Scanner sc = new Scanner(System.in);
		System.out.print("날수를 입력 : ");
		int days = sc.nextInt();

		seconds = days *24 * 60 * 60;

		System.out.printf("날수에 해당되는 기간은 모두 %d초입니다.\n",seconds);
		m_count = seconds/1000000;

		System.out.printf("100만 초가 모두 %d번이나 포함됩니다.\n",m_count);
	}

	public static void main(String[] a){
		new A03().start();
	}
}
