package com.test;

import java.util.Scanner;
import java.io.*;

public class B01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int[] num = null; //int[] num = new int[];
		
		for(int i=0; i<num.length; i++){
			System.out.print(i+1 + "번째 숫자 입력 : ");
			num[i] =  s.nextInt();
		}
		
		
	}
}
