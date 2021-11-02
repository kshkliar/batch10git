package replit;

public class Task053a {
	/***For you to do:**

	 Using do while loop print even numbers from 20 to 1
	 **Expected Output:**

	 ```
	 20
	 ```
	 ```
	 18
	 ```
	 ```
	 16
	 ```*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int num=20;
		do {
			if (num % 2 == 0) {
				System.out.print(num+"\t");
			}
			num--;
		} while (num>=1);
	}
}