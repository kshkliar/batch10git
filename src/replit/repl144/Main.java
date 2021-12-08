package replit.repl144;


class Main {
    public static void main(String[] args) {
        StoreProduct obj = new StoreProduct("Eggs", 3.0, "Produce",
                true, 10);
        obj.display();
        StoreProduct obj1 = new StoreProduct("Paper Towels", 2.0, 24);
        obj1.display();
        StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0);
        obj2.display();
    }
}

