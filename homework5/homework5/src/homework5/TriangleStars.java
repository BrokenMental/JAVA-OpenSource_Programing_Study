package homework5;

public class TriangleStars {

	public void Tri(int Tri1, int Tri2) {
		for(int i = 0; i<Tri2; i++){
			for(int j = i; j < Tri1; j++){
				System.out.print(" ");
			}
			for (int k = Tri2; k >= Tri2-i; k--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
