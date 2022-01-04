package andreyJava.homeworks.hw19;

/*You have a list of numbers to fill the table with prices in the shown way
implement Java method which receive this list and return the object which will be convenient to find price
using Month and Product keys*/
public class Product {
    private float price;
    private String month;
    private String name;

    public Product(float price, String month, String name) {
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
