package com.syntax.class08;

public class BreakKeyword {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            System.out.println("Today is Sunday");

            if (i == 4) {
                System.out.println("I am stopping the loop");
                break;
            }

            System.out.println(i);
        }

        boolean summer = true;
        int temp = 80;

        while (summer) {

            if (temp > 95) {
                System.out.println("I do not love hot summer");
                break;
            }

            System.out.println("I love summer");
            temp += 2;
        }
    }
}

//break - stop loop
//continue - go to next iteration

class BC {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}

			System.out.print(i + "\t");
		}
	}
}
