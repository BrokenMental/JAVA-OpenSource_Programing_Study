package homework5;

public class DiamondStars {

	public void Dia(int Dia) {
		for (int i = 0; i < (Dia * 2) - 1; i++) {
			if (i < Dia) {
				for (int j = (Dia * 2) - 1 - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = Dia; k <= Dia + (i * 2); k++) {
					System.out.print("*");
				}
				System.out.println();
			}else{
				int a = i-Dia;
				for (int j=i+1; j>0; j--){
					System.out.print(" ");
				}
				for (int k = (Dia*2)-3; k > a*2; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
