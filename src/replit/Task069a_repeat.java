package replit;
//  не понятно нужно повторить и разобраться
public class Task069a_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for (int i = 0; i < 7; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}


			System.out.print("--");   // another method of output
		}
	}
}