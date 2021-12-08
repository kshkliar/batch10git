package replit.repl156;

/***For you to do:**
 Create class A
 declare variable int i=10;
 Create class B  extends A
 declare variable int i=20;
 create a method to display value of variable i from both classes
 In Main Class create an object of subclass and call method display
 **Expected Output:**
 20
 10*/

class Aa {
    int i = 10;

}


class Bb extends Aa {
    int i = 20;

    public void display() {
        System.out.println(super.i);
        System.out.println(this.i);
    }
}

class Maina {
    public static void main(String[] args) {

        Bb obj = new Bb();
        obj.display();
    }
}



