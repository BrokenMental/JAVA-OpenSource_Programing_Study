package home;
import java.io.*;
import java.util.*;

public class home1 {

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("�� ���� �Է��ұ�? : ");
        int cho = sc.nextInt();
        
        int[] num = new int[cho];
        int x;
        
        for(int i = 0; i<cho; i++){
            /* �߸��� �ʱ�ȭ ���!
            System.out.printf("%d��° ���ڸ� �Է� : ",i+1);
            num[i] = sc.nextInt();
            System.out.printf("num%d = %d\n",i+1,num[i]);
            */
            
            System.out.printf("%d��° ���ڸ� �Է� : ",i+1);
            x = sc.nextInt();
            num[i] += x;
        }
        comp(num, cho);
    }
    
    void comp(int[] n, int c){
        if(n[0] > n[1]){
            int max = n[0];
            int min = n[1];
            for (int j=0; j<c-2; j++){
                if(max>n[j+2]){
                    if(min>n[j+2]){
                        min = n[j+2];
                    }
                }else{
                    max = n[j+2];
                }
            }
            print(max,min);
        }else{
            int min = n[0];
            int max = n[1];
            for (int j=0; j<c-2; j++){
                if(max>n[j+2]){
                    if(min>n[j+2]){
                        min = n[j+2];
                    }
                }else{
                    max = n[j+2];
                }
            }
            print(max,min);
        }
    }
    
    void print(int x, int n){
        System.out.printf("���� ū ���� %d�̰�, ���� ���� ���� %d �̴�.",x,n);
    }
    
    public static void main(String[] args)throws IOException {
        new home1().input();
    }
    
}