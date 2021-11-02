package replit.repl143;

class car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    car(String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        topSpeed=90;
        this.price=0;

    }

    car(int numberOfDoors,int topSpeed,double price){
        model="unknown";
        make="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    car(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    car(String make,String model,int numberOfDoors,int topSpeed,double price)
    {
        this(make,model,topSpeed,price);
        this.numberOfDoors=numberOfDoors;
        this.price=price;
    }

    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}
