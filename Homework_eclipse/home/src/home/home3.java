package home;
import java.io.*;
import java.util.Scanner;

public class home3 {

	void input(){
    	
        Scanner sc = new Scanner(System.in);
    	int day_count = 0;
    	int cm = 0,cd = 0;
    	
    	int[] month = new int[12];
    	m_input(month);
    	
        System.out.print("���� �Է��ϼ��� : ");
        cm = sc.nextInt();
        System.out.print("���� �Է��ϼ��� : ");
        cd = sc.nextInt();
        
        for(int i=0; i<cm-1; i++){
        	day_count += month[i];
        }
        
        day_count += cd;
        if(cm>0 && cm<13){
        	print(day_count);
        }else{
        	System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }
    }

	void print(int result) {
		System.out.printf("�� ��¥�� 1�� �� %d��° ���� �ش�˴ϴ�.", result);
	}

	void m_input(int[] m) {
		m[0] = 31;
		m[1] = 28;
		m[2] = 31;
		m[3] = 30;
		m[4] = 31;
		m[5] = 30;
		m[6] = 31;
		m[7] = 31;
		m[8] = 30;
		m[9] = 31;
		m[10] = 30;
		m[11] = 31;
	}

	public static void main(String[] args) throws IOException {
		new home3().input();
	}

}