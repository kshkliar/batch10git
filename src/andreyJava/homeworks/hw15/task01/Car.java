package andreyJava.homeworks.hw15.task01;

public abstract class  Car extends Vehicle {

    public Car() {
        super(4);
    }
}


    class Suv extends Car {


    }

    class Racing extends Car {
        @Override
        public void accelerate() {

        }

        @Override
        public void brake() {

        }
    }


    class Compact extends Car {
        @Override
        public void accelerate() {

        }

        @Override
        public void brake() {

        }
    }


