package home;
import java.io.*;
import java.util.Scanner;

public class home2 {

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("����Ʈ�� �о� ����(��������) �Է� : ");
        double m2_area = sc.nextDouble();
        
        double pyung_area = m2_area /3.305;
        System.out.printf("����Ʈ�� ������ %.1f�Դϴ�.\n", pyung_area);
        
        confirm(pyung_area);
    }
    
    void confirm(double p){
    	if(p<15){
    		System.out.println("���� ����Ʈ");
    	}else if(p>=15 && p<30){
    		System.out.println("�߼��� ����Ʈ");
    	}else if(p>=30 && p<50){
    		System.out.println("���� ����Ʈ");
    	}else{
    		System.out.println("���� ����Ʈ");
    	}
    }
    
    public static void main(String[] args)throws IOException {
        new home2().input();
    }
    
}