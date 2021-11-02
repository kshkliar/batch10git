package replit;

import java.util.Scanner;
/*  Given the following inputs:

int x;
```
Write a for loop that will print out a series of numbers starting at
one less than x and ending at 0.

Sample input/outputs:
```
In: 7
6 5 4 3 2 1 0
```
In: 12
11 10 9 8 7 6 5 4 3 2 1 0
```

```*/
public class Task065a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("In:");
		Scanner inp =new Scanner(System.in);
		int x=inp.nextInt();

		for (int i = x - 1; i >= 0; i--) {
			System.out.print(i+" ");
		}

	}

}
