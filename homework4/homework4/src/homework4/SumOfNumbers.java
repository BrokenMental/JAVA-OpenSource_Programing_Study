package homework4;

public class SumOfNumbers {
	
	public void plus(int num){
		int total = num;
		
		for(int i=1; i<num; i++){
			total+=i;
		}
		System.out.printf("총 합은 %d 입니다.",total);
	}

}
