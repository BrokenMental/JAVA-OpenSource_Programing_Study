import java.util.Scanner;
import java.io.*;

public class B04 {

	public void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("input : ");
		double num =  s.nextDouble();
		cal(num);
	}
	
	void cal(double n){
		if (n<10000000){
			System.out.printf("output : %.1f \n",n*0.095);
		}else if (n>=10000000 && n<40000000){
			System.out.printf("output : %.1f \n",n*0.19);
		}else if (n>=40000000 && n<80000000){
			System.out.printf("output : %.1f \n",n*0.28);
		}else{
			System.out.printf("output : %.1f \n",n*0.37);
		}
	}

	public static void main(String[] args) throws IOException {
		new B04().input();
	}

}

