package homework5;

public class IsoscelesTriangleStars {
	
	public void Iso(int Iso){
		for(int i = 0; i<=Iso; i++){
			for(int j = i; j < Iso; j++){
				System.out.print(" ");
			}
			for (int k = Iso; k >= Iso-i; k--) {
				System.out.print("*");
			}
			for(int l = Iso; l> Iso-i; l--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
