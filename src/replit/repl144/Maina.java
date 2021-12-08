package replit.repl144;


class Maina {
    public static void main(String[] args) {
        StoreProducta obj=new StoreProducta("Eggs ",3.0,"Produce",
                true,10);
        obj.display();
        StoreProducta obj1=new StoreProducta("Paper Towels ",2.0,24);
        obj1.display();
        StoreProducta obj2=new StoreProducta("Paper Towels ",2.0);
        obj2.display();
    }
}

