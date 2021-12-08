package replit.repl143;


class Main {
    public static void main(String[] args) {
        car car = new car("Toyota", "Prius", 4, 120, 30000.0);
        car car1 = new car("Toyota", "Prius", 120, 30000.0);
        car car2 = new car(4, 120, 30000.0);
        car car3 = new car("Toyota", "Prius", 4);
        car.display();
        car1.display();
        car2.display();
        car3.display();
    }
}

