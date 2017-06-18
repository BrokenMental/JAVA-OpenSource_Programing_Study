package homework5;

public class RectagleStars {

	public void Rec(int Rec) {
		int i = Rec / 2;
		while (i != 0) {
			for (int j = 0; j < Rec; j++) {
				System.out.print("*");
			}System.out.println();
			--i;
		}
	}
}
