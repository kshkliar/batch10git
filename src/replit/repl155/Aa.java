package replit.repl155;

/*1. Create three classes (A, B, C)
Write two constructors:
* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"
Make C extend B
and B extend A
From your Main class create an object of the C class.
**Expected Output:**
I
am
a tester*/
class Aa {

    Aa() {
        System.out.println("I");
    }
}
    class Bb extends Aa {
        Bb() {
            System.out.println("am");
        }
    }

    class Cc extends Bb {
        Cc() {
            System.out.println(" a tester");
        }
    }


