package replit.repl143;


class Maina {
    public static void main(String[] args) {
        cara car1 = new cara("Toyota", "Prius", 4, 120, 3000.00);
        cara car2 = new cara("Touota", "Prius", 120, 3000.00);
        cara car3 = new cara(4, 120, 3000.0);
        cara car4 = new cara("Toyota", "Prius", 4);
        car1.display();
        car2.display();
        car3.display();
        car4.display();

    }
}


