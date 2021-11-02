package com.syntax.class07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int i = 10;

        i = i + 1;
        i += 1;

        System.out.println(i);
        i++;//i+1

        System.out.println(i);

        int a = 10;
        a -= 1;

        a--;//a-1
        System.out.println(a);

        //10++; ++ or -- does not work with numbers, only applicable for VARIABLES

    }
}

class ID {
	public static void main(String[] args) {
		int count = 1;

		/*count = count + 1;

		count /= 1;*/

//		count++;//postincrement
//		++count;//preincrement

//		System.out.println(++count);
//		System.out.println(count);

		int result = ++count + ++count + count++ - -+count;//2+3 + 3 - 3

		System.out.println(result);
	}
}
