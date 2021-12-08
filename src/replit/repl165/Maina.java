package replit.repl165;

class Maina {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.DefaultMethod();
        obj.ProtectedMethod();
        obj.PublicMethod();
        //privat будет доступен только через геттеры сеттеры
    }

}

