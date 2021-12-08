package replit.repl148;

class Maina {
    public static void main(String[] args) {
        ShoppingStorea item1 = new ShoppingStorea(49, 2);
        ShoppingStorea item2 = new ShoppingStorea(439, 3);
        String item1Name = "Blanket";
        String item2Name = "Mattres";

        double item1Price = item1.itemTotalPrice();
        System.out.println(item1Name + " Total Price " + item1Price);

        double item2Price = item2.itemTotalPrice();
        System.out.println(item2Name + " Total Value " + item2Price);
        double spentTotally = item1Price + item2Price;
        System.out.println(" You spent " +spentTotally+ " $ today");
    }
}