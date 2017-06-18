package home;
import java.io.*;
import java.util.Scanner;

public class home2 {

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("아파트의 분양 면적(제곱미터) 입력 : ");
        double m2_area = sc.nextDouble();
        
        double pyung_area = m2_area /3.305;
        System.out.printf("아파트의 평형은 %.1f입니다.\n", pyung_area);
        
        confirm(pyung_area);
    }
    
    void confirm(double p){
    	if(p<15){
    		System.out.println("소형 아파트");
    	}else if(p>=15 && p<30){
    		System.out.println("중소형 아파트");
    	}else if(p>=30 && p<50){
    		System.out.println("중형 아파트");
    	}else{
    		System.out.println("대형 아파트");
    	}
    }
    
    public static void main(String[] args)throws IOException {
        new home2().input();
    }
    
}