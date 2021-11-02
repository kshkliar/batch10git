package repl147;

class Main {
    public static void main(String[] args) {
        carObjects toyota = new carObjects("Toyota", 2500, 1000);
        carObjects bmw = new carObjects("BMW", 6529.8, 100);
        toyota.carStockValue();
        bmw.carStockValue();

    }
}
