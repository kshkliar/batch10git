package andreyJava.homeworks.hw07;

import java.util.Objects;

/* Write Computer class, the attributes of this class is manufacturer (of enum type),
serialNumber (of int type), price (of float type),
quantityCPU (of int type) and frequencyCPU (of int type).

2) The fields Computer class need to be encapsulated.
Use correct access modifiers.
3) Write a program to create array of Computer objects (5 pcs.).
Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array.
4) Write a program that iterate through array of Computer objects and increases by 10 percent field price.
5) Add to class Computer method void view(){} that prints all fields of object in line.
Print all info (fields) of all objects in console.*/
public class Computer {
    private Manufacturer manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(Manufacturer manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;

    }

      public float getPrice() {return price;}

    public void setPrice(float price) {
        this.price = price;
    }

    public void view() {
        System.out.println(serialNumber + ", " + price);
    }

}

class TestComputer {
    public static void main(String[] args) {
        Computer comp1 = new Computer(Manufacturer.APPLE, 12234, 12.34f, 6, 256);
        Computer comp2 = new Computer(Manufacturer.SAMSUNG, 2346, 67.45f, 8, 555);

        Computer[] computers = new Computer[5];//nulls
        computers[0] = comp1;
        computers[1] = comp2;

        for (Computer c : computers) {//переменная с содержит элемент(обьект) массива на каждой итерации;на каждой итерации подставляяет объект компьютера
            if (Objects.nonNull(c)) {
                float price = c.getPrice();

                price += price * 0.1f;

                c.setPrice(price);
                c.view();
            }

        }

    }

}
