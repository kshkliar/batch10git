package com.collection.class29.arraylistdemo;

public abstract class Flower {
    String type;
    String color;
    public Flower(String type,String color){
        this.type=type;
        this.color=color;

    }
    public abstract void bloom();
}
class Rose extends Flower{

    Rose(String type,String color){
        super(type,color);
    }
    public void bloom(){
        System.out.println(type+" Blooms in May");
    }
}
class Tulip extends Flower{

    public Tulip(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+"Blooms in March");
    }
}
class Sunflower extends Flower{

    public Sunflower(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+" Blooms in August");
    }
}