package repl147;

class carObjects {
    String model;
    double price;
    int quantity;
    carObjects(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    void carStockValue() {
        double stock_Value=price * quantity;
        System.out.println(model + " 2019 Stock Value " + stock_Value);
    }
}